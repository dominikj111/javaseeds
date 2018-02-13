package dominoLibs.spipoc;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import dominoLibs.spipoc.Works;
import dominoLibs.spipoc.Work;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.ServiceLoader;
import dominoLibs.spipoc.WorkProvider;

public class Main {

    public static void main(String[] args) throws URISyntaxException, MalformedURLException, IOException {

        // inner service
        // System.out.println("Call method through object (classic way)");
        // URI uri = new URI("InnerWorkProvides");
        // Work work = Works.getWork(uri);
        // work.execute();

        // appFolderPath
        String classPath = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath().replace("%20", " "); // spaces in path works, %20 not!
        Boolean isJar = classPath.toLowerCase().endsWith(".jar");
        String appFolder = isJar ?
                new File(classPath).getParent().concat("/") :
                new File(classPath).getParentFile().getParent().concat("/");

        // app folder + plugin folder from properties
        Properties mappings = new Properties();
        mappings.load(Main.class.getResourceAsStream("mappings.properties"));

        mappings.setProperty("modulesPath", appFolder.concat(mappings.getProperty("modulesPath")));

        // get all jars from plugin folder
        ArrayList<File> jars = new ArrayList<>(Arrays.asList(new File(mappings.getProperty("modulesPath")).listFiles((File pathname) -> pathname.getName().toLowerCase().endsWith(".jar"))));
        ArrayList<URL>  urls = new ArrayList<>();

        System.out.println("** All Module Jars");
        jars.forEach( (jar) -> { try{ System.out.println(jar.toURI().toURL()); } catch (Exception e){ System.out.println("error 1"); } } );

        jars.forEach( (jar) -> { try{ urls.add(jar.toURI().toURL()); } catch (Exception e){ System.out.println("error 2"); }} );

        System.out.println("** Loading modules -> ServiceLoader URLs:");
        urls.forEach( (u) -> { System.out.println(u); } );


        URLClassLoader urlsClassLoader = new URLClassLoader(urls.toArray(new URL[urls.size()]));
        ServiceLoader<WorkProvider> sl = ServiceLoader.load(WorkProvider.class, urlsClassLoader);

        Iterator<WorkProvider> wsit = sl.iterator();

        System.out.println("** Running implementations");

        while (wsit.hasNext()) {
            WorkProvider wp = wsit.next();

            System.out.println(wp.getClass());

            wp.getWork(new URI("Some/URI")).execute();
            System.out.println(wp.getScheme());
        }
    }
}
