package com.company;

public class Main {

    /* Написать программу , которая при вводе с клавиатуры дня недели отвечает на вопрос является ли этот день выходным.
    (для выходного ответ it is true , для рабочего it is false.  Использовать в решении класс типа ENUM .
    Вам может понадобиться метод этого класс valueOf
    DayOfWeek day=DayOfWeek.valueOf("Wednesday"); */

    public static void main(String[] args) {
        System.out.println(isDayOff("sunday"));
    }

    public static boolean isDayOff (String day){
        try {
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
            switch (dayOfWeek){
                case SATURDAY,SUNDAY: return true;
                default: return false;
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Error! " + ex);
            return false;
        }
    }
}
