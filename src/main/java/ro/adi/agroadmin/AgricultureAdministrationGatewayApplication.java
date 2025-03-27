package ro.adi.agroadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AgricultureAdministrationGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgricultureAdministrationGatewayApplication.class, args);
    }
}
