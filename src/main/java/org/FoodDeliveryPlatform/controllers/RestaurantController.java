package org.FoodDeliveryPlatform.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.FoodDeliveryPlatform.Entity.RestaurantService.RestaurantEntity;
import org.FoodDeliveryPlatform.repository.RestaurantService.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class RestaurantController {

    @Autowired
    private final RestaurantRepository restaurantRepository;
    private final ObjectMapper objectMapper;

    @SneakyThrows
    @GetMapping("/api/restaurant/get")
    public List<RestaurantEntity> getAll(){
        return restaurantRepository.findAll();
    }

    @GetMapping("/api/restaurant/getById")
    public RestaurantEntity getById(int id){
        return restaurantRepository.findById(id).orElseThrow();
    }

    @DeleteMapping("/api/restaurant/delete")
    public void deleteRestaurant(@RequestBody int id){
        restaurantRepository.deleteById(id);
    }

    @PostMapping("/api/restaurant/add")
    public RestaurantEntity add(@RequestBody RestaurantEntity restaurant){
        return restaurantRepository.save(restaurant);
    }

    @PutMapping("/api/restaurant/change")
    public String changeRestaurant(RestaurantEntity restaurant){
          if(restaurantRepository.existsById(restaurant.getId())){
              return restaurantRepository.save(restaurant).toString();
          }

          return "No restaurant with this id in repository";
    }
}
