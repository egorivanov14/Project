package org.FoodDeliveryPlatform.repository.RestaurantService;

import org.FoodDeliveryPlatform.Entity.RestaurantService.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<DishEntity, Integer> {
}
