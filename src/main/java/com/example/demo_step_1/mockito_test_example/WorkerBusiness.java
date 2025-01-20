package com.example.demo_step_1.mockito_test_example;


public class WorkerBusiness {

    WorkerDao workerDao;

    public WorkerBusiness(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }

    public WorkerDao getWorkerDao() {
        return workerDao;
    }

    public void setWorkerDao(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }

    public int fetchGreatestWorker() {
        int[] data = workerDao.getWorkerData();
        int greatest = Integer.MIN_VALUE;
        for (int it : data) {
            if (it > greatest) {
                greatest = it;
            }
        }
        return greatest;
    }
}
