package org.FoodDeliveryPlatform.repository.RestaurantService;


import org.FoodDeliveryPlatform.Entity.RestaurantService.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {
}
