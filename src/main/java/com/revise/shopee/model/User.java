//package com.revise.shopee.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Entity
//@Data
//@Table(name = "USER_TABLE")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String username;
//    private String password;
//    private String email;
//    private String fullName;
//    private String address;
//    private String role;
//
//    @OneToMany
//    @JoinColumn(name = "ORDER_ID")
//    private List<Order> orders;
//}
