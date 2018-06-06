package com.arithmetic;

public class five {

    public static void main(String[] s) {
        // 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
        A43();
        // 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的四位数？都是多少？
        A44();
    }

    // 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    private static void A43() {

    }

    // 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的四位数？都是多少？
    private static void A44() {
        permutate("1234");
    }

    public static void permutate(String input) {
        if (input == null)
            throw new IllegalArgumentException();
        char[] data = input.toCharArray();
        permutate(data, 0);
    }

    public static void permutate(char[] data, int begin) {
        int length = data.length;
        if (begin == length)
            System.out.println(data);
        for (int i = begin; i < length; i++) {
            if (isUnique(data, begin, i)) {
                swap(data, begin, i);
                permutate(data, begin + 1);
                swap(data, begin, i);
            }
        }
    }

    //去重的全排列就是从第一个数字起每个数分别与它后面非重复出现的数字交换。
    private static boolean isUnique(char[] data, int begin, int end) {
        for (int i = begin; i < end; i++)
            if (data[i] == data[end])
                return false;
        return true;
    }

    private static void swap(char[] data, int left, int right) {
        char temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }
}
