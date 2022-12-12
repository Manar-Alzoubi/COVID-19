package com.example.covid19.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AllCountries {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    public String country;
    public String slug;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AllCountries() {
    }

    public AllCountries(String country, String slug) {
        this.country = country;
        this.slug = slug;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String toString() {
        return "AllCountries{" +
                "country='" + country + '\'' +
                ", slug='" + slug + '\'' +
                '}';
    }

}

