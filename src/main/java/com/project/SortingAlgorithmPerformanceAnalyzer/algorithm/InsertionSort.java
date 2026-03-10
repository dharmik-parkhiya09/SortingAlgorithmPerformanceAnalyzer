package com.project.SortingAlgorithmPerformanceAnalyzer.algorithm;

import com.project.SortingAlgorithmPerformanceAnalyzer.model.SortingResult;

public class InsertionSort {

    public static SortingResult sort(int[] arr) {

        long comparisons = 0;
        long swaps = 0;
        int n = arr.length;

        long start = System.nanoTime();

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                comparisons++;

                arr[j + 1] = arr[j];
                j--;

                swaps++;
            }

            arr[j + 1] = key;
        }

        long end = System.nanoTime();

        return new SortingResult("Insertion Sort", n, end - start, comparisons, swaps);
    }
}