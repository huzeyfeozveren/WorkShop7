package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Table(name="colors")
@Entity
public class Color {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String colorName;
    @OneToMany(mappedBy = "colorId")
    private List<Car> cars;
}
