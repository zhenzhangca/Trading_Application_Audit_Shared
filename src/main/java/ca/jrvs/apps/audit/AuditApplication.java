package ca.jrvs.apps.audit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuditApplication {
    private Logger logger = LoggerFactory.getLogger(ca.jrvs.apps.audit.AuditApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(ca.jrvs.apps.audit.AuditApplication.class, args);
    }

}
