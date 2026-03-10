package com.project.SortingAlgorithmPerformanceAnalyzer.algorithm;

import com.project.SortingAlgorithmPerformanceAnalyzer.model.SortingResult;

public class BubbleSort {

    public static SortingResult sort(int[] arr) {

        long comparisons = 0;
        long swaps = 0;

        long start = System.nanoTime();

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {

                comparisons++;

                if(arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swaps++;
                }
            }
        }

        long end = System.nanoTime();

        return new SortingResult(
                "Bubble Sort",
                arr.length,
                end - start,
                comparisons,
                swaps
        );
    }
}
