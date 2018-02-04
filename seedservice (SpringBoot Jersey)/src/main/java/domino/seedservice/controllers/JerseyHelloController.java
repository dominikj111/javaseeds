package domino.seedservice.controllers;

import domino.seedservice.services.SampleService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/jersey2")
public class JerseyHelloController {
    
    private final SampleService service;
    
    public JerseyHelloController(SampleService service){
        this.service = service;
    }
    
    @GET
    public String message(){
        return "Jersey service message: " + this.service.message() + " + General message: " + this.service.messageFromApplicationProperties();
    }
}
