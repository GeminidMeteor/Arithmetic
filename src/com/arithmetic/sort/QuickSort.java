package com.arithmetic.sort;

import java.util.Random;

/**
 * 快速排序
 */
public class QuickSort {
    public static void sort(int[] array) {
        shuffle(array);
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(array, lo, hi);
        sort(array, lo, j - 1);
        sort(array, j + 1, hi);
    }

    private static int partition(int[] array, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = array[lo];
        while (true) {
            while (array[++i] < v) if (i == hi) break;
            while (v < array[--j]) if (j == lo) break;
            if (i >= j) break;

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        int temp = array[lo];
        array[lo] = array[j];
        array[j] = temp;
        return j;
    }

    /**
     * 打乱数组
     */
    private static void shuffle(int[] array) {
        Random random = new Random(System.currentTimeMillis());
        if (array == null) throw new NullPointerException("argument array is null");
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int r = i + random.nextInt(n - i);     // between i and n-1
            int temp = array[i];
            array[i] = array[r];
            array[r] = temp;
        }
    }

}
