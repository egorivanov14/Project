package org.FoodDeliveryPlatform.Entity.OrderService;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "PAYMENT")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "orderid")
    private OrderEntity orderEntity;

    private String method;
    private Integer amount;
    private String status;

}
