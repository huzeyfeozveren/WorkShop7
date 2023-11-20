package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.util.Date;

@Table(name="rentals")
@Entity
public class Rental {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car carId;

    @Column(name="start_date")
    private Date startDate;
    @Column(name="end_date")
    private Date endDate;

}
