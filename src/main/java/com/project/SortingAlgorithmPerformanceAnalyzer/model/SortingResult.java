package com.project.SortingAlgorithmPerformanceAnalyzer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SortingResult {
    private String algorithm;
    private int size;
    private long timeTaken;
    private long comparisons;
    private long swaps;
}
