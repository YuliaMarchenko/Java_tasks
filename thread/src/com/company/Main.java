package com.company;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

	Printer p1 = new Printer("first", "*");
    Printer p2 = new Printer("second", "-");

    Runnable r1 = new Runnable() {
        @Override
        public void run() {

            for (int i = 0; true; i++){
                System.out.println(Thread.currentThread().getId() + " the best thtead: " + i);
            }
        }
    }

        Instant start = Instant.now();
        p1.start();
        Thread.sleep(1000);
        p2.start();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(() -> System.out.println("I'm simple thread"));
        t1.setDaemon(true);
        t1.start();
        t2.start();

        p1.join();
        p2.join();

        for(int i = 0; i < 10000000; i++){
            Integer h = i;
            h++;
        }

        Instant finish = Instant.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Finish");
    }
}
