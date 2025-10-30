package com.shodhacode.contest_platform.repository;

import com.shodhacode.contest_platform.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
}
