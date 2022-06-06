package com.company;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User(String input) {
        String[] parts = input.split(";");

        if (parts.length > 4) {
            throw new IllegalArgumentException("В строке больше полей, чем необходимо");
        }

        if (parts.length == 3 && input.charAt(input.length() - 1) == ';') {
            throw new IllegalArgumentException("Поле email не задано (пустое)");
        }

        if (parts.length < 4) {
            throw new IllegalArgumentException("Некорректный формат строки. В строке не хватает данных");
        }

        String[] fields = {"first name", "last name", "age", "email"};
        for (int i = 0; i < parts.length; i++) {
            if (parts[i] == null || parts[i].equals("")) {
                throw new IllegalArgumentException("Поле " + fields[i] + " не задано (пустое)");
            }
        }
        this.firstName = parts[0];
        this.lastName = parts[1];

        try {
            this.age = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Поле возраст некорректно");
        }

        if (parts[3].length() < 4 || !parts[3].contains("@")) {
            throw new IllegalArgumentException("email имеет неправильный формат: короче 4 символов или не содержит символ @.");
        }
        this.email = parts[3];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
