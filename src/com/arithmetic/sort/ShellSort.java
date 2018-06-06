package com.arithmetic.sort;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void sort(int[] array) {
        int n = array.length;
        int h = 1;
        while (h < n / 3){
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && (array[j] < array[j - h]); j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h /= 3;
        }
    }
}
