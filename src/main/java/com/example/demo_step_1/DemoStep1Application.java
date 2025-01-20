package com.example.demo_step_1;

import com.example.demo_step_1.basics.BinarySearchImpl;
import com.example.demo_step_1.basics.TYPE;
import com.example.demo_step_1.scope.PersonDao;
import component_scan.component_scan.MyComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("component_scan.component_scan")
public class DemoStep1Application {

    static Logger LOGGER = LoggerFactory.getLogger(DemoStep1Application.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoStep1Application.class, args);

        ///  BASICS COVERED HERE
         basics(context);

        /// SCOPE : Complex use case
        //scopeUseCase(context);

        /// Component Scan : Component scan from diff packages
        //componentScan(context);
    }

    private static void scopeUseCase(ApplicationContext context) {
        PersonDao personDao1 = context.getBean(PersonDao.class);
        PersonDao personDao2 = context.getBean(PersonDao.class);

        /// personDao1 & personDao2 both are same object of a singleton scoped bean
        /// But jdbcConnection object inside personDao are scoped with prototype
        /// so they will be created new every time the personDao is created with context.getBean()

        LOGGER.info("{}", personDao1);
        personDao1.connectJdbc();

        LOGGER.info("{}", personDao2);
        personDao2.connectJdbc();
    }

    public static void componentScan(ApplicationContext context) {
        MyComponent component = context.getBean(MyComponent.class);
    }


    public static void basics(ApplicationContext context) {

        ///  Old manual Approach for decoupling dependency
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
//        int result = binarySearch.search(new int[]{12, 3, 544, 66, 7, 3}, 66);
//        System.out.println( "Search result : " +result);
//        SpringApplication.run(DemoStep1Application.class, args);

        ///  New Approach using spring for decoupling dependency

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
