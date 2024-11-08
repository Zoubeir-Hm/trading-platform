package com.zhm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zhm.domain.USER_ROLE;
import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @Embedded
    private TwoFactorAuth twoFactorAuth = new TwoFactorAuth();
    private USER_ROLE role= USER_ROLE.ROLE_CUSTOMER;
}
