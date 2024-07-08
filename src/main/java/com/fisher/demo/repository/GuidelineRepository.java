package com.fisher.demo.repository;

import com.fisher.demo.model.Guideline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuidelineRepository extends JpaRepository<Guideline, Long> {
}
