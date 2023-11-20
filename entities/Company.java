package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="companies")
@Entity
public class Company {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="adress")
    private String adress;
    @ManyToOne
    @JoinColumn(name="origin_id")
    private Origin originId;
}
