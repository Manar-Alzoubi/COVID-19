package com.example.covid19.Domain;

import java.util.ArrayList;

public class RootCountry {
// To save all countries in an array list
    public ArrayList<Country> countries;

    public RootCountry(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "RootCountry{" +
                "countries=" + countries +
                '}';
    }
}
