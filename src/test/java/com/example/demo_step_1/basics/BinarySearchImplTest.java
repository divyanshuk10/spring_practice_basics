package com.example.demo_step_1.basics;

import com.example.demo_step_1.DemoStep1Application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import static org.junit.jupiter.api.Assertions.*;

//@RunWith(value = SpringRunner.class)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DemoStep1Application.class)
public class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearchImpl;

    @Test
    public void testSearch() {
        int result = binarySearchImpl.search(new int[]{1, 66, 2, 3, 4}, 66, TYPE.QUICK);
        assertEquals(1, 1);
    }
}