package org.FoodDeliveryPlatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // аннотация, указывающая на то, что этот класс будет запускать SpringBoot приложение
@EnableAutoConfiguration
public class SpringBootStarter {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarter.class, args); // для того чтобы запустить наше Java приложение на Spring
    }
}
