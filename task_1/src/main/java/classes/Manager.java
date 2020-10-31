package classes;

public class Manager extends Employee {

    static private  final  int MonthlyHours = 160; /** Норма рабочей недели: 40 часов. В одном месяце - 4 недели. */

    public  double getPercent()
    {
        if(getWorkingHours()>MonthlyHours)
        {
            return getSalary();
        }
        return getWorkingHours()*100/MonthlyHours;
    }
    public  double getMonthlySalary()
    {
        return (getSalary()/MonthlyHours)*getWorkingHours();
    }
}
