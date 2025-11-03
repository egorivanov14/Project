package org.FoodDeliveryPlatform.services;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.FoodDeliveryPlatform.Entity.UserService.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/api/main")
    public String mainListener(){
        return "Hello guest!";
    }





}
