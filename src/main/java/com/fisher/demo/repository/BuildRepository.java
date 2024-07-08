package com.fisher.demo.repository;

import com.fisher.demo.model.Build;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildRepository extends JpaRepository<Build, Long> {
}

