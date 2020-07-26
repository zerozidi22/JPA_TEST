package com.example.JPA_TEST.repository;

import com.example.JPA_TEST.model.member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface memberRepository extends JpaRepository<member, Integer> {
}
