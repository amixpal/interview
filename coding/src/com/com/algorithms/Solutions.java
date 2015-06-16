package com.com.algorithms;

import java.util.List;

public class Solutions {
    // DO NOT MODFIY THE LIST.
    public int maxSubArray(final List<Integer> A) {
        int maxSum = 0;
        for(int i=0;i<A.size();i++){
            maxSum = A.get(i) + maxSum;
            if(maxSum < 0){
                maxSum = 0;
                System.out.println(maxSum);
            }
        }
        return maxSum;
    }
}
