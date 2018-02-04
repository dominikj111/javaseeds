package domino.seedservice;

import domino.seedservice.controllers.JerseyController;
import domino.seedservice.controllers.JerseyHelloController;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
            register(JerseyController.class);
            register(JerseyHelloController.class);
    }
}
