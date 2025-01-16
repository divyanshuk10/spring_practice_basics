package com.example.demo_step_1.basics;

import org.springframework.stereotype.Component;

import java.util.Arrays;

///  It is a bean
@Component
public class QuickSort implements Sorter {

    @Override
    public void sort(int[] nums){
        Arrays.sort(nums);
    }
}
