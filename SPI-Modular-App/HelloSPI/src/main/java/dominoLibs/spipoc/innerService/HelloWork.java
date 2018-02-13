package dominoLibs.spipoc.innerService;

import dominoLibs.spipoc.Work;
import dominoLibs.spipoc.WorkProvider;

/**
 * Created by gerard on 02-12-2015.
 */
public class HelloWork extends Work {


    @Override
    public WorkProvider provider() {
        return null;
    }

    @Override
    public void execute() {
        System.out.println("Execute -> Hello from Inner Service");
    }
}
