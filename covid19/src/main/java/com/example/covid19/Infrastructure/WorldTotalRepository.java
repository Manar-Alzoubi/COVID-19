package com.example.covid19.Infrastructure;

import com.example.covid19.Domain.WorldTotal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorldTotalRepository extends JpaRepository<WorldTotal,Integer> {
}
