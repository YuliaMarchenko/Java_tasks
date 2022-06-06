package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void testAllGood() {
        String str = "John;Lennon;40;lennon@mail.com";
        User user = new User(str);
        Assertions.assertEquals("John", user.getFirstName());
        Assertions.assertEquals("Lennon", user.getLastName());
        Assertions.assertEquals(40, user.getAge());
        Assertions.assertEquals("lennon@mail.com", user.getEmail());
    }

    @Test
    public void testMoreParts() {
        String str = "John;Lennon;40;lennon@mail.com;fd";
        String expected = "В строке больше полей, чем необходимо";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User(str);
        });
        Assertions.assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testLessParts() {
        String str = "John;Lennon;40";
        String expected = "Некорректный формат строки. В строке не хватает данных";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User(str);
        });
        Assertions.assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testFirstNameEmpty() {
        String str = ";Lennon;40;lennon@mail.com";
        String expected = "Поле first name не задано (пустое)";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User(str);
        });
        Assertions.assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testLastNameEmpty() {
        String str = "John;;40;lennon@mail.com";
        String expected = "Поле last name не задано (пустое)";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User(str);
        });
        Assertions.assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testAgeEmpty() {
        String str = "John;Lennon;;lennon@mail.com";
        String expected = "Поле age не задано (пустое)";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User(str);
        });
        Assertions.assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testEmailEmpty() {
        String str = "John;Lennon;40;";
        String expected = "Поле email не задано (пустое)";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User(str);
        });
        Assertions.assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testAgeIncorrect() {
        String str = "John;Lennon;cat;lennon@mail.com";
        String expected = "Поле возраст некорректно";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User(str);
        });
        Assertions.assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testEmailIncorrect() {
        String str = "John;Lennon;40;lennonmail.com";
        String expected = "email имеет неправильный формат: короче 4 символов или не содержит символ @.";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User(str);
        });
        Assertions.assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testEmailIncorrectLess4Symbols() {
        String str = "John;Lennon;40;@om";
        String expected = "email имеет неправильный формат: короче 4 символов или не содержит символ @.";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User(str);
        });
        Assertions.assertEquals(expected, exception.getMessage());
    }
}
