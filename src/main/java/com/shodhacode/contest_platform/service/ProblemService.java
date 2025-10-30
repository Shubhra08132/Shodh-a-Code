package com.shodhacode.contest_platform.service;

import com.shodhacode.contest_platform.model.Problem;
import com.shodhacode.contest_platform.repository.ProblemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProblemService {
    private final ProblemRepository problemRepository;

    public ProblemService(ProblemRepository problemRepository) {
        this.problemRepository = problemRepository;
    }

    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }

    public Problem createProblem(Problem problem) {
        return problemRepository.save(problem);
    }
}
