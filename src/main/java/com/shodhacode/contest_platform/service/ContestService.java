package com.shodhacode.contest_platform.service;

import com.shodhacode.contest_platform.model.Contest;
import com.shodhacode.contest_platform.repository.ContestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContestService {
    private final ContestRepository contestRepository;

    public ContestService(ContestRepository contestRepository) {
        this.contestRepository = contestRepository;
    }

    public List<Contest> getAllContests() {
        return contestRepository.findAll();
    }

    public Contest createContest(Contest contest) {
        return contestRepository.save(contest);
    }
}
