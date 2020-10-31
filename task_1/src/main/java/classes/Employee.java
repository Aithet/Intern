package classes;

public abstract class Employee {

    private String name;
    private String surname;
    private int id = 0;
    private double salary;
    private double workingHours;

    public Employee() {
        id ++;
    }

    public Employee(String name, String surname, int id, double salary) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public final int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    /** Делаем эти два метода абстрактными, потому что для классов Programmer и Manager реализация будет разная. */
    public abstract double getPercent();

    public abstract double getMonthlySalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
