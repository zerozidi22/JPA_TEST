package com.example.JPA_TEST.repository;

import com.example.JPA_TEST.model.subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface subjectRepository extends JpaRepository<subject, Integer> {
}
