package com.example.covid19.Infrastructure;

import com.example.covid19.Domain.AllCountries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllCountriesRepository extends JpaRepository<AllCountries,Long> {
}
