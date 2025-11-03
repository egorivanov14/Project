package org.FoodDeliveryPlatform.Entity.OrderService;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.FoodDeliveryPlatform.Entity.RestaurantService.DishEntity;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "orderid")
    private OrderEntity order;

    @OneToOne
    @JoinColumn(name = "dishid")
    private DishEntity dish;

    private Integer quantity;
    private Integer price;


}
