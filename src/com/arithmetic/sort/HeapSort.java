package com.arithmetic.sort;

/**
 * 堆排序
 */
public class HeapSort {
    public static void sort(int[] a) {
        int N = a.length;
        int[] keys = new int[N + 1];
        //注意，堆的数据结构是从1开始的，0不用
        for (int i = 1; i < keys.length; i++) {
            keys[i] = a[i - 1];
        }
        //构造堆,使得堆是有序的
        for (int k = N / 2; k >= 1; k--) sink(keys, k, N);
        //排序，相当于毁掉堆
        while (N > 1) {
            exch(keys, 1, N--);
            sink(keys, 1, N);
        }
        //重新写回数组
        for (int i = 0; i < a.length; i++) {
            a[i] = keys[i + 1];
        }
    }

    private static void sink(int[] a, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(a[j], a[j + 1])) j++;
            if (less(a[j], a[k])) break;
            exch(a, k, j);
            k = j;
        }
    }

    private static boolean less(int k, int j) {
        return k < j;
    }

    private static void exch(int[] a, int i, int n) {
        int temp = a[i];
        a[i] = a[n];
        a[n] = temp;
    }
}
