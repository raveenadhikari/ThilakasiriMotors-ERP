package com.example.erp.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String gender;
    private String birthday;
    private String nic;
    private String email;
    private String phone;
    private String role;
    private String password;
    
}
