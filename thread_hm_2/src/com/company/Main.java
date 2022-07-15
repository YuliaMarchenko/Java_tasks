package com.company;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

	/* Ваша программа должна заполнить массив на 100 миллионов int случайными числами.
	Реализуйте заполнение 1) в 1 поток, 2) в 2 параллельных потока,
	в 5 параллельных потоков (каждый поток заполняет свою часть массива).
	Измерьте время выполнения каждого из вариантов, сравните результаты. */

        int[] array = new int[100000000];
        Random random = new Random(System.currentTimeMillis());
        Instant start = Instant.now();

        for (int i = 0; i < 100000000; i++) {
            array[i] = random.nextInt();
        }

        Instant finish = Instant.now();
        System.out.println("One thread: " + ChronoUnit.MILLIS.between(start, finish));

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 50000000; i < 100000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        start = Instant.now();

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        finish = Instant.now();
        System.out.println("Two threads: " + ChronoUnit.MILLIS.between(start, finish));

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 20000000; i < 40000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 40000000; i < 60000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        Thread th4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 60000000; i < 80000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        Thread th5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 80000000; i < 100000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        start = Instant.now();

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th1.join();
        th2.join();
        th3.join();
        th4.join();
        th5.join();

        finish = Instant.now();
        System.out.println("Five threads: " + ChronoUnit.MILLIS.between(start, finish));


        Thread th11 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 25000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        Thread th22 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 25000000; i < 50000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        Thread th33 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 50000000; i < 75000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        Thread th44 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 75000000; i < 100000000; i++) {
                    array[i] = random.nextInt();
                }
            }
        });

        start = Instant.now();

        th11.start();
        th22.start();
        th33.start();
        th44.start();
        th11.join();
        th22.join();
        th33.join();
        th44.join();

        finish = Instant.now();
        System.out.println("Four threads: " + ChronoUnit.MILLIS.between(start, finish));
    }
}
