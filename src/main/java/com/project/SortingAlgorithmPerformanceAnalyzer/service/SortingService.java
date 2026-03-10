package com.project.SortingAlgorithmPerformanceAnalyzer.service;

import com.project.SortingAlgorithmPerformanceAnalyzer.algorithm.*;
import com.project.SortingAlgorithmPerformanceAnalyzer.model.SortingResult;
import com.project.SortingAlgorithmPerformanceAnalyzer.util.ArrayGenerator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SortingService {

    public List<SortingResult> analyzeAll(int size, String type) {

        int[] baseArray = ArrayGenerator.generateArray(size, type);

        List<SortingResult> results = new ArrayList<>();

        results.add(BubbleSort.sort(baseArray.clone()));
        results.add(SelectionSort.sort(baseArray.clone()));
        results.add(InsertionSort.sort(baseArray.clone()));
        results.add(MergeSort.sort(baseArray.clone()));
        results.add(QuickSort.sort(baseArray.clone()));

        return results;
    }

    public SortingResult analyzeSingle(String algorithm, int size, String type) {

        int[] arr = ArrayGenerator.generateArray(size, type);

        switch (algorithm.toLowerCase()) {

            case "bubble":
                return BubbleSort.sort(arr);

            case "selection":
                return SelectionSort.sort(arr);

            case "insertion":
                return InsertionSort.sort(arr);

            case "merge":
                return MergeSort.sort(arr);

            case "quick":
                return QuickSort.sort(arr);

            default:
                throw new RuntimeException("Invalid Algorithm");
        }
    }
}