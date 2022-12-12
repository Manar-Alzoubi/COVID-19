package com.example.covid19.Infrastructure;

import com.example.covid19.Domain.MyRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRecordsRepository extends JpaRepository<MyRecords,Long> {
}
