package com.example.demo_step_1.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

///  It is a bean
//@Primary
//@Qualifier("bubble")
@Component
public class BubbleSort implements Sorter {


    @Override
    public void sort(int[] nums) {
        Arrays.sort(nums);
    }
}
