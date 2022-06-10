package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	try{
        m();
    } catch (Exception e){
        e.printStackTrace();
    }
    }

    public static void m() throws FileNotFoundException {
        try {
            throw new Exception("1");
        } catch (Exception e){
            System.out.println("2");
        }finally {
            System.out.println("3");
        }
    }
}
