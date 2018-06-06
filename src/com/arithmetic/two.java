package com.arithmetic;

public class two {
    //题目：打印出所有的"水仙花数(narcissus number)"，所谓"水仙花数"是指一个三位数，
    // 其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
    // 利用for循环控制100-999个数，每个数分解出个位，十位，百位。
    public static void main(String[] s) {
        for (int num = 100; num < 999; num++) {
            int bbb = num / 100;      //百位
            int bb = (num % 100) / 10;//十位
            int b = (num % 100) % 10; //各位
            if ((bbb * bbb * bbb + bb * bb * bb + b * b * b) == num) {
                System.out.println("水仙花数  " + num);
            }
        }
    }
}
