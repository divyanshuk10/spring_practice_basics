package com.example.demo_step_1.mockito_test_example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class WorkerBusinessTest {

    @Mock
    WorkerDao workerDao;

    @InjectMocks
    WorkerBusiness workerBusiness;


    @Test
    void setUp() {
        Mockito.when(workerDao.getWorkerData()).thenReturn(new int[]{1, 2, 3, 4, 5});
        int greatest = 5;
        assertEquals(greatest, workerBusiness.fetchGreatestWorker());
    }
}