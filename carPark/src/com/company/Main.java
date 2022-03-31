package com.company;

public class Main {

    public static void main(String[] args) {
	/*Представите, мы создаем программу для автопарка.
	Допустим, у нас есть Автобусы, Грузовики и легковые машины (Bus, Truck и Car соответственно).
	Каждое транспортное средство имеет гос.номер и год выпуска.
	Основная характеристика автобуса - сколько пассажиров он может перевести.
	Для грузовика важно, сколько тон груза он может перевести.
	Для автомобиля важна и грузоподъёмность и пассажировместимость. Реализуйте структуру классов для нашей программы.
	Кроме стандартных toString, необходимых геттеров и сеттеров,
	реализуйте для всех транспортных средств метод goToRace который моделирует поездку
	(пусть он выводит на экран что то типа "автобус №.... повез 10 пассажиров" или "грузовик № …. повез .... тон").*/

        Bus bus1995 = new Bus ("DE 432 8766", 1995, 55);
        System.out.println(bus1995.goToRace());

        Truck truck2021 = new Truck("BG 42 553224", 2021, 34.00);
        System.out.println(truck2021.goToRace());

        Car car2019 = new Car("DE 42 9652823", 2019, 15, 3);
        System.out.println(car2019.goToRace());
    }
}