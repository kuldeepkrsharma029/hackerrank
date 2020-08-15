package com.hakerrank.arrays;

import java.util.Arrays;

public class SinglyLinkedListDriver {

	public static void main(String[] args) {
		int[][] queries = new int[2][3];
		queries[0][0] = 0;
		queries[0][1] = 2;
		queries[0][2] = 4;
		queries[1][0] = 1;
		queries[1][1] = 3;
		queries[1][2] = 5;
		System.out.println(arrayManipulation(6, queries));
	}
	
	// Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long [] zeroes = new long[n];
        for(int i=0; i<queries.length; i++) {
            addInRange(zeroes, queries[i][0],  queries[i][1],  queries[i][2]);
        }
        Arrays.sort(zeroes);
        return zeroes[zeroes.length-1];
    }

    static void addInRange(long[] zeroes, int startIndex, int endIndex, int sumOperation) {
        for(int i = startIndex; i<=endIndex; i++) {
            zeroes[i] += sumOperation;
        }
    }

}
