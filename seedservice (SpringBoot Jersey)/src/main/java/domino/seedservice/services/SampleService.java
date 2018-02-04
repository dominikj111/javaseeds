package domino.seedservice.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SampleService {
    
    @Value("${message:World}")
    private String msg;
    
    @Value("${generalMessage}")
    private String genMessage;

    public String message() {
        return this.msg;
    }    
    
    public String messageFromApplicationProperties() {
        return this.genMessage;
    }
}
