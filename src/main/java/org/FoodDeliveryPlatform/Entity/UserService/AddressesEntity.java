package org.FoodDeliveryPlatform.Entity.UserService;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ADDRESSES")
public class AddressesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String street;
    private String city;
    private String zip;
    private String state;
    private String country;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

}
