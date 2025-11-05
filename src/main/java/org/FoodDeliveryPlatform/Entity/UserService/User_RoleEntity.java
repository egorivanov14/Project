package org.FoodDeliveryPlatform.Entity.UserService;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users_role")
public class User_RoleEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;


    @OneToOne
    @JoinColumn(name = "role_id")
    private RoleEntity roleEntity;

}