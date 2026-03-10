package com.project.SortingAlgorithmPerformanceAnalyzer.util;

import java.util.Random;

public class ArrayGenerator {

    public static int[] generateArray(int size, String type) {

        int[] arr = new int[size];

        if(type.equalsIgnoreCase("ascending")) {

            for(int i=0;i<size;i++)
                arr[i] = i;

        }
        else if(type.equalsIgnoreCase("descending")) {

            for(int i=0;i<size;i++)
                arr[i] = size - i;

        }
        else {

            Random rand = new Random();

            for(int i=0;i<size;i++)
                arr[i] = rand.nextInt(10000);
        }

        return arr;
    }
}