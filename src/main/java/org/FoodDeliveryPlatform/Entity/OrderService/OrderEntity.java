package org.FoodDeliveryPlatform.Entity.OrderService;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.FoodDeliveryPlatform.Entity.RestaurantService.RestaurantEntity;
import org.FoodDeliveryPlatform.Entity.UserService.UserEntity;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ORDER")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String status;
    private Timestamp orderDate;

    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "restaurantid")
    private RestaurantEntity restaurant;

    private Integer totalPrice;

}
