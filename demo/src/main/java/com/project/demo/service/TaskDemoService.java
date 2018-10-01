package com.project.demo.service;

import java.util.concurrent.Future;

public interface TaskDemoService {

    String task1() throws InterruptedException;
    String task2() throws InterruptedException;
    String task3() throws InterruptedException;

    Future<String> task4() throws InterruptedException;
    Future<String> task5() throws InterruptedException;
    Future<String> task6() throws InterruptedException;
}
