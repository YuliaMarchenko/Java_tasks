package com.company;

public class Main {

    public static void main(String[] args) {
	/* 1. Let’s improve our employee project.
	Let’s add several type of programmers: BackEnd programmer, FrontEnd programmer and FullStack.
	All type of programmers should doWork() but BackEnd programmers should “Write code and improve backend”,
	FrontEnd programmers should “Write code and Implement new features”.
	The work of FullStack programmers not defined.*/

        BackEnd vasia = new BackEnd("Vasia", "Ivanov");
        FrontEnd petia = new FrontEnd("Petia", "Sidorov");
        FullStack daria = new FullStack("Daria", "Murzikova");

        Employee [] employees = {vasia, petia, daria};

        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].toString() + employees[i].doWork());
        }

	/* 2.Add to Manager field team. It must contain an array of Employee.
	You should not initialize it from constructor.
	You should implement the method addEmployeeToTeam that takes an Employee and add to team.*/

        Manager andrey = new Manager("Andrey", "Pushka");
        andrey.addEmployeeToTeam(vasia);
        andrey.addEmployeeToTeam(daria);
        System.out.println(andrey.toString() + andrey.doWork());
    }
}
