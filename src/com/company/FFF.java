package com.company;

public class FFF {
    public static void main(String[] args) {

        int[] a = new int[]{15, 2, 9, -1, 10, -130, 56, 8, 10};
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];

        }
        System.out.println("Min " + min);
    }
}