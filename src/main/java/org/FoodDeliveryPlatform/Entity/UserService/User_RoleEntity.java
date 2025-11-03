package org.FoodDeliveryPlatform.Entity.UserService;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USER_ROLE")
public class User_RoleEntity {

    @ManyToMany
    @JoinColumn(name = "user_id")
    private UserEntity user;


    @OneToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;

}