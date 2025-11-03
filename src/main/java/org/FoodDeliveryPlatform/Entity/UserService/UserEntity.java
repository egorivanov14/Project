package org.FoodDeliveryPlatform.Entity.UserService;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
@Builder
@Entity
@Table (name = "USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String email;

    private String password_hash;

    private String full_name;

    private Timestamp created_at;

    private Timestamp updated_at;



}
