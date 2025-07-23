package org.example.microms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MIcroMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MIcroMsApplication.class, args);
    }

}
