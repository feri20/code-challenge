package com.wolf.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MaxSubRange {

    @Test
    void findMaxSubrange(){
        List<Integer> input = new ArrayList<>();
        input.add(-10);
        input.add(-18);
        input.add(-20);
        input.add(0);
        input.add(-5);
        input.add(-1);
        String maxSubRange = "";
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<input.size();i++){
            if (input.get(i)>maxSum){
                maxSum = input.get(i);
                maxSubRange = String.valueOf(input.get(i));
            }
            for (int j=i+1;j<input.size();j++){
                int sum = input.subList(i,j).stream().mapToInt(Integer::intValue).sum();
                if (sum>maxSum){
                    maxSum = sum;
                    maxSubRange = String.valueOf(input.subList(i,j));
                }
            }

        }
        System.out.println(maxSubRange+" "+maxSum);
    }

}
