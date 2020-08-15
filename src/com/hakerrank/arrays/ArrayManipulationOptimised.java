package com.hakerrank.arrays;

import java.io.IOException;

public class ArrayManipulationOptimised {

	public static void main(String[] args) throws IOException {
    	int n=10;
    	int[][] queries = new int[3][3];
    	queries[0][0] = 1;
    	queries[0][1] = 5;
    	queries[0][2] = 3;
    	
    	queries[1][0] = 4;
    	queries[1][1] = 8;
    	queries[1][2] = 7;
    	
    	queries[2][0] = 6;
    	queries[2][1] = 9;
    	queries[2][2] = 1;
    	
    	
        long result = arrayManipulation(n, queries);
        System.out.println(result);
    }
    
    static long arrayManipulation(int n, int[][] queries) {
        long [] zeroes = new long[n+1];
        int m = queries.length;
        while(m-- > 0) {
        	zeroes[queries[m][0]-1] += queries[m][2];
        	zeroes[queries[m][1]] -= queries[m][2];
        }
        long sum = 0;
        long max = 0;
        for (long ele : zeroes) {
            sum += ele;
            max = Math.max(max, sum);
        }
        return max;
    }

}
