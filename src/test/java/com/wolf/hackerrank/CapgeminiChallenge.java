package com.wolf.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class CapgeminiChallenge {

    @Test
    void arrayIntersection(){
        int[] first = {1,5,9,9,7,7};
        int[] second = {4,5,6,9,8,7,2,2,2,3,3,11,12};
        Set<Integer> firstSet = Arrays.stream(first).boxed().collect(Collectors.toSet());
        Set<Integer> secondSet = Arrays.stream(second).boxed().collect(Collectors.toSet());
        firstSet.retainAll(secondSet);
        System.out.println(firstSet);

    }
}
