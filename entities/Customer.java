package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="customers")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="age")
    private int age;
    @Column(name="adress")
    private String adress;
    @Column(name="companies_id")
    private int companies_id;
    @OneToMany(mappedBy = "customerId")
    private List<Rental> rentals;
}
