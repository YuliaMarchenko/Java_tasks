package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

	/* Необходимо создать класс Counter с единственным полем counter типа Integer.
	Необходимо реализовать 3 метода: увеличение значение counter на 1,
	уменьшения значения поля counter на 1 и печать значения counter при условие,
	если значение counter кратно 100. Создать 1 объект типа Counter.
	Создать 3 потока, каждый из которых миллион раз вызывает метод увеличивающий значение counter,
	3 потока уменьшающих значение counter. Создать 1 поток (demon) вызывающий метод печати.
	Запустить все созданные потоки параллельно. По завершении распечатать значение counter. */

        Counter counter = new Counter(0);

        Runnable rInc = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i < 1000000) {
                    i++;
                    counter.increase();
                }
            }
        };

        Thread tI1 = new Thread(rInc);
        Thread tI2 = new Thread(rInc);
        Thread tI3 = new Thread(rInc);
        tI1.start();
        tI2.start();
        tI3.start();

        Runnable rDec = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i < 1000000) {
                    i++;
                    counter.decrease();
                }
            }
        };

        Thread tD1 = new Thread(rDec);
        Thread tD2 = new Thread(rDec);
        Thread tD3 = new Thread(rDec);
        tD1.start();
        tD2.start();
        tD3.start();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    counter.print();
                }
            }
        });
        t.setDaemon(true);
        t.start();

        tI1.join();
        tD1.join();
        tI2.join();
        tD2.join();
        tI3.join();
        tD3.join();
    }
}
