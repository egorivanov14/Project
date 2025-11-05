package org.FoodDeliveryPlatform.Entity.UserService;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;


@Data
@Entity
@Table(name = "users")
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
