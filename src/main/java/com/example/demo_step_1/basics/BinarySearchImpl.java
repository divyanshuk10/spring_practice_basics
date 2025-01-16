package com.example.demo_step_1.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

///  It is a bean for application class

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope("request")
//@Scope("session")
public class BinarySearchImpl {
    @Autowired
    //@Qualifier("bubble")
    private Sorter quickSort;

    @Autowired
    private Sorter bubbleSort;

    public Sorter getQuickSort() {
        return quickSort;
    }

    public Sorter getBubbleSort() {
        return bubbleSort;
    }

    //    @Autowired
//    public void setSorter(Sorter sorter) {
//        this.sorter = sorter;
//    }

//    public BinarySearchImpl(Sorter sorter) {
//        this.sorter = sorter;
//    }

    public int search(int[] nums, int target, TYPE type) {
        Sorter sorter;
        if(type == TYPE.BUBBLE){
            sorter = bubbleSort;
        }else{
            sorter = quickSort;
        }
        sorter.sort(nums);
        System.out.println("Search Algorithm used : "+ sorter);
        return Arrays.binarySearch(nums, target);
    }
}

