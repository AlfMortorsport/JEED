package com.example.Spring.data.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;
}
