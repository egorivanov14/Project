package org.FoodDeliveryPlatform.Entity.RestaurantService;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "DISH")
public class DishEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;
    private Integer price;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "restaurantid")
    private RestaurantEntity restaurant;
}
