package com.company;

public class Main {

    public static void main(String[] args) {

	/* 1. Make a class Computer with the following attributes (String cpu, int ram, int hdd, double price).
	Implement the method that print all information about the Computer.
	Create several objects of Computer and put it into array. Print all computers.
	2. Make class Book. It should contain two fields: author and title.
	The author is a Class with the following field firstName, lastName, yearOfBirth.
	Implement the method of printing the Book
	3. Do you remember the tasks about students and grades?
	Try to create the class or classes those ft best for this task. */

        Author author1 = new Author();
        author1.firstName = "Alexander";
        author1.lastName = "Pushkin";
        author1.yearOfBirth = 1799;

        Book bookPushkin1 = new Book();
        bookPushkin1.title = "Wish";
        bookPushkin1.author = author1;

        print(bookPushkin1);

        Author author2 = new Author();
        author2.firstName = "Sergey";
        author2.lastName = "Dostoevskiy";
        author2.yearOfBirth = 1869;

        Book bookDostoevskiy1 = new Book();
        bookDostoevskiy1.title = "See";
        bookDostoevskiy1.author = author2;

        print(bookDostoevskiy1);
    }

    public static void print(Book book){
        System.out.println("Author: " + book.author.lastName + " " + book.author.firstName + " " + book.author.yearOfBirth + " " + "Title: " + book.title);
    }
}
