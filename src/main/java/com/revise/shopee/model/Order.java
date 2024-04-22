//package com.revise.shopee.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Entity
//@Data
//@Table(name = "ORDER_TABLE")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @ManyToOne
//    @JoinColumn(name = "USER_ID")
//    private User user;
//    private BigDecimal totalPrice ;
//    private LocalDateTime orderDate ;
//    private String status;
//
//}
