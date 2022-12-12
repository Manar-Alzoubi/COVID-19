package com.example.covid19.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class WorldTotal {
    @Id
    @GeneratedValue
    public int id;
    public int TotalConfirmed;
    public int TotalDeaths;
    public int TotalRecovered;

    public WorldTotal() {
    }

    public WorldTotal(int totalConfirmed, int totalDeaths, int totalRecovered) {
        TotalConfirmed = totalConfirmed;
        TotalDeaths = totalDeaths;
        TotalRecovered = totalRecovered;
    }

    public int getTotalConfirmed() {
        return TotalConfirmed;
    }

    public void setTotalConfirmed(int totalConfirmed) {
        TotalConfirmed = totalConfirmed;
    }

    public int getTotalDeaths() {
        return TotalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        TotalDeaths = totalDeaths;
    }

    public int getTotalRecovered() {
        return TotalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        TotalRecovered = totalRecovered;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "TotalConfirmed=" + TotalConfirmed +
                ", TotalDeaths=" + TotalDeaths +
                ", TotalRecovered=" + TotalRecovered +
                '}';
    }
}
