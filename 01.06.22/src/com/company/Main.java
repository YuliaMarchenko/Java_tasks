package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().method(10, 2));
        System.out.println(new Main().method1(10, 2));
        System.out.println(new Main().method2(10, 2));

        try {
            System.out.println(new Main().method3(10, 2));
        } catch (Exception e){
            System.out.println("Exception method 3");
        }

        try {
            new Main().method4(10, 6);
        } catch (IOException e){
            System.out.println("Exception method 4");
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        try {
            new Main().method4(10, 6);
        } catch (Exception e){
            System.out.println("Exception method 4.2");
            e.printStackTrace();
        }
    }

    public int method(int a, int b) {
        try {
            int res = a / b;
            return res;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
        System.out.println("run code after try");
        return 0;
    }

    public int method1(int a, int b) {
        try {
            int res = a / b;
            return res;
        } catch (ArithmeticException e) {
            System.out.println("Error");
            throw e;
        }
    }

    public int method2(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("error!!!!");
        }
        int res = a / b;
        return res;
    }

    public int method3(int a, int b) throws Exception{
        if (b == 0) {
            throw new Exception("error!!!! Exception!!!!!");
        }
        int res = a / b;
        return res;
    }

    public void method4(int a, int b) throws IOException,InterruptedException {
        FileReader fileReader = new FileReader("d:/file.txt");
        fileReader.read();
        Thread.sleep(34);
    }
}
