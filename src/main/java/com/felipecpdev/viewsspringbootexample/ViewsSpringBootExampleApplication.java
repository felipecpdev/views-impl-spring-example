package com.felipecpdev.viewsspringbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ViewsSpringBootExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViewsSpringBootExampleApplication.class, args);
    }

}
