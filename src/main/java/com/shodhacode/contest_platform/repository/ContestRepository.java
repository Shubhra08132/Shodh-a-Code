package com.shodhacode.contest_platform.repository;

import com.shodhacode.contest_platform.model.Contest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContestRepository extends JpaRepository<Contest, Long> {
}
