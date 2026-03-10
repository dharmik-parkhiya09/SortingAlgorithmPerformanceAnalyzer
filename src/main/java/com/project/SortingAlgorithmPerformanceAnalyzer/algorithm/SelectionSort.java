package com.project.SortingAlgorithmPerformanceAnalyzer.algorithm;

import com.project.SortingAlgorithmPerformanceAnalyzer.model.SortingResult;

public class SelectionSort {

    public static SortingResult sort(int[] arr) {

        long comparisons = 0;
        long swaps = 0;
        int n = arr.length;

        long start = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                comparisons++;

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            swaps++;
        }

        long end = System.nanoTime();

        return new SortingResult("Selection Sort", n, end - start, comparisons, swaps);
    }
}