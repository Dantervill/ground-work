package com.example.testproject.repository;

import com.example.testproject.model.transactionpropagation.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ReportRepository extends JpaRepository<Report, Long> {

    @Modifying
    @Query("update Report r set r.published = true where r.id = :id")
    void updatePublished(@Param("id") Long id);
}
