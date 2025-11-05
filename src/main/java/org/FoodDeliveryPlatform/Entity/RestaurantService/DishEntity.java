package org.FoodDeliveryPlatform.Entity.RestaurantService;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "dish")
public class DishEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;
    private String description;
    private Integer price;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "restaurantid")
    private RestaurantEntity restaurantEntity;
}
