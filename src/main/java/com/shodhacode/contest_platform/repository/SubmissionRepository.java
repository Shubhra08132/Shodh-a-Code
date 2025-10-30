package com.shodhacode.contest_platform.repository;

import com.shodhacode.contest_platform.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}
