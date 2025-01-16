package com.example.demo_step_1;

import com.example.demo_step_1.basics.BinarySearchImpl;
import com.example.demo_step_1.basics.TYPE;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoStep1Application {

    ///  BASICS COVERED HERE
    public static void main(String[] args) {

        ///  Old manual Approach for decoupling dependency
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
//        int result = binarySearch.search(new int[]{12, 3, 544, 66, 7, 3}, 66);
//        System.out.println( "Search result : " +result);
//        SpringApplication.run(DemoStep1Application.class, args);

        ///  New Approach using spring for decoupling dependency
        ApplicationContext context = SpringApplication.run(DemoStep1Application.class, args);
        BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch2 = context.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch2);
        System.out.println(binarySearch);

//        QuickSort quickSort = context.getBean(QuickSort.class);
//        binarySearch.setSorter(quickSort);
        int result = binarySearch.search(new int[]{12, 3, 544, 66, 7, 3}, 66, TYPE.BUBBLE);
        System.out.println("Search result index : " + result);
//        if (binarySearch.getBubbleSort() instanceof BubbleSort) {
//            System.out.println("Search Algorithm used : BubbleSort");
//        } else if (binarySearch.getQuickSort() instanceof QuickSort) {
//            System.out.println("Search Algorithm used : QuickSort");
//        }
        //       BubbleSort bubbleSort = context.getBean(BubbleSort.class);
//        binarySearch.setSorter(bubbleSort);
        int result2 = binarySearch.search(new int[]{12, 3, 544, 66, 7, 3}, 66, TYPE.QUICK);
        System.out.println("Search result index : " + result2);
//        if (binarySearch.getBubbleSort() instanceof BubbleSort) {
//            System.out.println("Search Algorithm used : BubbleSort");
//        } else if (binarySearch.getQuickSort() instanceof QuickSort) {
//            System.out.println("Search Algorithm used : QuickSort");
//        }
    }

}
