package com.project.SortingAlgorithmPerformanceAnalyzer.controller;

import com.project.SortingAlgorithmPerformanceAnalyzer.model.SortingResult;
import com.project.SortingAlgorithmPerformanceAnalyzer.service.SortingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sort")
public class SortingController {

    private final SortingService sortingService;

    public SortingController(SortingService sortingService) {
        this.sortingService = sortingService;
    }

    @GetMapping("/compare")
    public List<SortingResult> compareAll(
            @RequestParam int size,
            @RequestParam(defaultValue = "random") String type) {

        return sortingService.analyzeAll(size, type);
    }

    @GetMapping("/run")
    public SortingResult runAlgorithm(
            @RequestParam String algorithm,
            @RequestParam int size,
            @RequestParam(defaultValue = "random") String type) {

        return sortingService.analyzeSingle(algorithm, size, type);
    }
}