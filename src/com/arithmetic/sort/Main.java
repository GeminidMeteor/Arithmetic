package com.arithmetic.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] s) {
        int[] array = new int[]{2, 3, 5, 8, 9, 0, 4, 5, 1, 6, 8, 7};
        //交换排序
        //冒泡排序
        BubbleSort.sort(array);
        //快速排序
        QuickSort.sort(array);

        //插入排序
        //直接插入排序
        InsertSort.sort(array);
        //希尔排序
        ShellSort.sort(array);

        //选择排序
        //选择排序
        SelectSort.sort(array);
        //堆排序
        HeapSort.sort(array);

        //归并排序
        MergeSort.mergeSort(array);

        //基数排序
        // RadixSort.radixSort();

        System.out.println(Arrays.toString(array));
    }
}
