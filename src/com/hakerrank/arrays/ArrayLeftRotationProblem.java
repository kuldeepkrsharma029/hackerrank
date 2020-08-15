package com.hakerrank.arrays;
import java.util.Scanner;

public class ArrayLeftRotationProblem {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        scanner.close();
        rotateArray(a, d);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }

    /**
     * Using Reversal algorithm
     * @param a
     * @param d
     */
    public static void rotateArray(int[] a, int d) {
        reverseArray(a, 0, d-1);
        reverseArray(a, d, a.length-1);
        reverseArray(a, 0, a.length-1);
    }

    public static void reverseArray(int[] a, int start, int end) {
        int temp = 0;
        while(start<end) {
            temp = a[start]; 
            a[start] = a[end]; 
            a[end] = temp; 
            start++; 
            end--; 
        }
    }
}
