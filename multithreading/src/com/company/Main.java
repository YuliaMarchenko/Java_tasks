package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i < 100) {
                    System.out.println("*");
                    i++;
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i < 100) {
                    System.out.println("-");
                    i++;
                }
            }
        };

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);

        th1.start();
        th2.start();
        th1.join();
        th2.join();

        System.out.println("end of main");
    }
}
