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
        andrey.addEmployeeToTeam(petia);
        System.out.println(andrey.toString() + andrey.doWork());

    /* Implement the removeEmployeeFromTeam(int index) in Manager in our Employee project.
    Think about how you could solve this problem in assumption that element order in teamArray does not matter.*/

        andrey.removeEmployeeFromTeam(1);
        System.out.println(andrey.toString() + andrey.doWork());

    /* Let’s create new class EmployeeTeam that should handle the array of Employees.
    This class should have private field array of Employees and implements toString(),
    add(Employee employee) method and remove(int index) method.*/

        EmployeeTeam employeeTeam = new EmployeeTeam();
        employeeTeam.addEmployeeToTeam(daria);
        employeeTeam.addEmployeeToTeam(vasia);
        employeeTeam.addEmployeeToTeam(petia);
        System.out.println(employeeTeam.toString());

        employeeTeam.removeEmployeeFromTeam(1);
        System.out.println(employeeTeam.toString());

        employeeTeam.removeEmployeeFromTeam2(petia);
        System.out.println(employeeTeam.toString());

    /* Think how could you refactor the Employee project and use the new EmployeeTeam class.*/

        //done
    }
}
