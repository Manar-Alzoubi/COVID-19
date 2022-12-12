package com.example.covid19.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MyRecords {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;


    public MyRecords() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
