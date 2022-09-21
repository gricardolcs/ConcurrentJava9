package com.java9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runnable {
    public static void main(String[] args) {
        java.lang.Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++)
                System.out.println("Hello " + i);
        };
        java.lang.Runnable goodbyes = () -> {
            for (int i = 1; i <= 1000; i++)
                System.out.println("Goodbye " + i);
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbyes);
        executor.shutdown();
    }
}
