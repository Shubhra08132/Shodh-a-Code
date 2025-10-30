package com.shodhacode.contest_platform.controller;

import com.shodhacode.contest_platform.model.Contest;
import com.shodhacode.contest_platform.repository.ContestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // allow frontend access
@RequestMapping("/contests")
public class ContestController {

    @Autowired
    private ContestRepository contestRepository;

    @GetMapping
    public List<Contest> getAllContests() {
        return contestRepository.findAll();
    }

    @PostMapping
    public Contest createContest(@RequestBody Contest contest) {
        return contestRepository.save(contest);
    }
}
