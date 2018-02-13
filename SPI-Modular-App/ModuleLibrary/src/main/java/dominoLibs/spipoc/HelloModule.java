/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominoLibs.spipoc;

import java.net.URI;
import java.util.Map;
import dominoLibs.spipoc.Work;
import dominoLibs.spipoc.WorkProvider;

public class HelloModule extends WorkProvider {

    private static Work myWork = new Work() {

        @Override
        public WorkProvider provider() {
            return null;
        }

        @Override
        public void execute() {
            System.out.println("Execute -> Hello from Module Service");
        }
    };

    @Override
    public String getScheme() {
        return "library getScheme";
    }

    @Override
    public Work newWork(URI uri, Map<String, ?> env) {
        return myWork;
    }

    @Override
    public Work getWork(URI uri) {
        return myWork;
    }

}
