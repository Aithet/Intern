package classes;

public class Programmer extends Employee {

    static private  final  int MonthlyHours = 160; /** Норма рабочей недели: 40 часов. В одном месяце - 4 недели. */

    public  double getPercent()
    {
        return getWorkingHours()*100/MonthlyHours;
    }

    public  double getMonthlySalary()
    {
        return (getSalary()/MonthlyHours)*getWorkingHours();
    }
}
