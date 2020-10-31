package classes;

import java.util.Random;

public class Main{

    /**
     * Метод, который будет решать поставленную задачу.
     */
    public static void main(String[] args) {

        Programmer developer = new Programmer();
        Manager manager = new Manager();
        Accountant accountant = new Accountant();
        developer.setName("Alex");
        developer.setSalary(1500);
        developer.setWorkingHours(150);
        manager.setName("John");
        manager.setSalary(3000);
        manager.setWorkingHours(140);
        Employee[] emp = new Employee[]{developer, manager};
        System.out.println("Работник: " + developer.getName() + "; Зарплата: " + developer.getSalary());
        System.out.println("Работник: " + manager.getName() + "; Зарплата: " + manager.getSalary());
        System.out.println("Зарплата сотрудников за месяц " + accountant.calculateSalary(emp));

    }

}