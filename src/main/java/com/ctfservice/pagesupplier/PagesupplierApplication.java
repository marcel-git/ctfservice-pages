package com.ctfservice.pagesupplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PagesupplierApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagesupplierApplication.class, args);
    }

}
