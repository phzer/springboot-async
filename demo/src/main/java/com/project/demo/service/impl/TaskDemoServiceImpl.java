package com.project.demo.service.impl;

import com.project.demo.service.TaskDemoService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class TaskDemoServiceImpl implements TaskDemoService {

    @Async
    @Override
    public String task1() throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        Thread.sleep(1000);
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("task1任务耗时:" + (currentTimeMillis1 - currentTimeMillis) + "ms");
        return null;
    }

    @Async
    @Override
    public String task2() throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        Thread.sleep(2000);
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("task2任务耗时:" + (currentTimeMillis1 - currentTimeMillis) + "ms");
        return null;
    }

    @Async
    @Override
    public String task3() throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        Thread.sleep(4000);
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("task3任务耗时:" + (currentTimeMillis1 - currentTimeMillis) + "ms");
        return null;
    }

    @Async
    @Override
    public Future<String> task4() throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        Thread.sleep(1000);
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("task4任务耗时:" + (currentTimeMillis1 - currentTimeMillis) + "ms");
        return new AsyncResult<String>("task4执行完毕");
    }

    @Async
    @Override
    public Future<String> task5() throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        Thread.sleep(2000);
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("task5任务耗时:" + (currentTimeMillis1 - currentTimeMillis) + "ms");
        return new AsyncResult<String>("task5执行完毕");
    }

    @Async
    @Override
    public Future<String> task6() throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        Thread.sleep(3000);
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("task6任务耗时:" + (currentTimeMillis1 - currentTimeMillis) + "ms");
        return new AsyncResult<String>("task6执行完毕");
    }


}
