package com.project.demo.controller;

import com.project.demo.service.TaskDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
public class AsyncController {

    @Autowired
    private TaskDemoService service;

    @RequestMapping(name = "/async", method = RequestMethod.POST)
    public String asyncDemo() throws InterruptedException, ExecutionException {

        long currentTimeMillis = System.currentTimeMillis();
        service.task1();
        service.task2();
        service.task3();
        long currentTimeMillis1 = System.currentTimeMillis();

        System.out.println("task任务总耗时:" + (currentTimeMillis1 - currentTimeMillis) + "ms");

        long currentTimeMillis2 = System.currentTimeMillis();
        Future<String> stringFuture = service.task4();
        Future<String> stringFuture1 = service.task5();
        Future<String> stringFuture2 = service.task6();
        long currentTimeMillis3 = System.currentTimeMillis();
        /*while (true) {
            if (stringFuture.isDone()) {
                // 三个任务都调用完成，退出循环等待
                //System.out.println(stringFuture2.get());
            }
            if (stringFuture1.isDone()) {
                // 三个任务都调用完成，退出循环等待
                //System.out.println(stringFuture1.get());
            }
            if (stringFuture2.isDone()) {
                // 三个任务都调用完成，退出循环等待
                System.out.println(stringFuture2.get());
                break;
            }
        }*/
            System.out.println("futureTask任务总耗时:" + (currentTimeMillis3 - currentTimeMillis2) + "ms");
            System.out.println("总耗时:" + (currentTimeMillis3 - currentTimeMillis) + "ms");

        return "task任务总耗时:" + (currentTimeMillis1 - currentTimeMillis) + "ms";


    }


}
