package tests;

import classes.Accountant;
import classes.Employee;
import classes.Manager;
import classes.Programmer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void negativeSalary() {
        Programmer developer = new Programmer();
        Manager manager = new Manager();
        Accountant accountant = new Accountant();
        developer.setName("Alex");
        developer.setSalary(-1500);
        developer.setWorkingHours(150);
        manager.setName("John");
        manager.setSalary(3000);
        manager.setWorkingHours(140);
        Employee[] emp = new Employee[]{developer, manager};
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getSalary() < 0) {
                System.out.println("Заплата не может быть отрицательной. Бухгалтер не может посчитать ");
                return;
            }
            else {
                System.out.println("Работник: " + developer.getName() + "; Зарплата: " + developer.getSalary());
                System.out.println("Работник: " + manager.getName() + "; Зарплата: " + manager.getSalary());
                System.out.println("Зарплата сотрудников за месяц " + accountant.calculateSalary(emp));
                return;
            }
        }
    }

    @Test
    void getEmployees() {
        Programmer developer = new Programmer();
        Manager manager = new Manager();
        developer.setName("Alex");
        developer.setSalary(1500);
        developer.setWorkingHours(150);
        manager.setName("John");
        manager.setSalary(3000);
        manager.setWorkingHours(140);
        Employee[] emp = new Employee[]{developer, manager};
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getName() + " - " + emp[i].getMonthlySalary() + "$ за " + emp[i].getPercent() + "% отработанного времени.");
        }
    }

    @Test
    void FullWorkingOff() {
        Programmer developer = new Programmer();
        Manager manager = new Manager();
        Accountant accountant = new Accountant();
        developer.setName("Alex");
        developer.setSalary(1500);
        developer.setWorkingHours(160);
        manager.setName("John");
        manager.setSalary(3000);
        manager.setWorkingHours(160);
        Employee[] emp = new Employee[]{developer, manager};
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getWorkingHours() < 160) {
                System.out.println(emp[i].getName() + " отработал не полную ставку");
            }
            else {
                System.out.println(emp[i].getName() + " отработал полную ставку");
            }
        }
    }

    @Test
    void correctSalaryOfEmployeesForMonth() {
        Programmer developer = new Programmer();
        Manager manager = new Manager();
        Accountant accountant = new Accountant();
        developer.setName("Alex");
        developer.setSalary(1500);
        developer.setWorkingHours(140);
        manager.setName("John");
        manager.setSalary(3000);
        manager.setWorkingHours(150);
        Employee[] emp = new Employee[]{developer, manager};
        double actual = accountant.calculateSalary(emp);
        double expected = developer.getSalary() + manager.getSalary();
        assertNotEquals(actual, expected);
    }

}
