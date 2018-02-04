package domino.seedservice.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class AnotherSpringController {
    
        @RequestMapping(value="/hello/{name}", method = RequestMethod.GET)
        public String sayHello(@PathVariable String name, ModelMap model){
            
            return "Greetings from Spring Boot for " + name;
        }

        @RequestMapping(value="/hello", method = RequestMethod.GET)
        public String sayDefaultHello(){

            return "Hello from Spring Boot!";
        }
}
