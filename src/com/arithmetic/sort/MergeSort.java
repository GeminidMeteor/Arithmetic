package com.arithmetic.sort;

/**
 * 归并排序
 */
public class MergeSort {
    public static void mergeSort(int[] array) {
        int[] aux = new int[array.length];
        sort(array, aux, 0, array.length - 1);
    }

    private static void sort(int[] array, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(array, aux, lo, mid);
        sort(array, aux, mid + 1, hi);
        merge(array, aux, lo, mid, hi);
    }

    private static void merge(int[] array, int[] aux, int lo, int mid, int hi) {
        System.arraycopy(array, 0, aux, 0, array.length);
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) array[k] = aux[j++];
            else if (j > hi) array[k] = aux[i++];
            else if (aux[j] < aux[i]) array[k] = aux[j++];
            else array[k] = aux[i++];
        }
    }
}
