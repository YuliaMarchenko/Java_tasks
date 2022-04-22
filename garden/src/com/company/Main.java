package com.company;

/* Садовод-любитель
 * Выращиваем растения в течение нескольких лет и смотрим что будет
 * Задача: выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики
 * -name,height,age.  Каждый из видов растений вырастает за сезон на разную высоту, одинаковую для всех деревьев
 * и всех цветов
 *
 * Каждый сезон состоит из четырех времен года , в которые цветы и деревья ведут себя не всегда одинаково
 * Сезон для  цветов и деревьев начинается весной
 * Цветы: зимой не растут, летом тоже не растут а цветут,осенью их срезают
 * Деревья: зимой не растут,летом растут,осенью не растут, весной растут
 * В классе Garden создать по одному цветку и дереву и создать метод growPlants в котором происходит
 * процесс роста этих двух растений в течение нескольких лет. */

public class Main {

    public static void main(String[] args) {
        Plant tree1 = new Tree("Pine", 15, 2);
        Plant flower1 = new Flower("Tulip", 0, 1);

        Plant[] plants = {tree1, flower1};
        int numberOfYears = 2;

        System.out.println("Growing plants for " + numberOfYears + " years");

        growPlantsForNumberOfYears(plants, numberOfYears);

        System.out.println("Tree has height: " + tree1.getHeight() + " and is " + tree1.getAge() + " years old");
        System.out.println("Flower has height: " + flower1.getHeight() + " and is " + flower1.getAge() + " years old");

    }

    public static void growPlantsForNumberOfYears(Plant[] plants, int numberOfYears) {
        for (int i = 0; i < numberOfYears; i++) {
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
        }
    }
}
