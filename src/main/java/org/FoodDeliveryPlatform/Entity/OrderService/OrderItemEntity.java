package org.FoodDeliveryPlatform.Entity.OrderService;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.FoodDeliveryPlatform.Entity.RestaurantService.DishEntity;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "orderid")
    private OrderEntity orderEntity;

    @OneToOne
    @JoinColumn(name = "dishid")
    private DishEntity dishEntity;

    private Integer quantity;
    private Integer price;


}
