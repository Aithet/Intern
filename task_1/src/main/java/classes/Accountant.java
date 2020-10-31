package classes;

public class Accountant {

    public double calculateSalary (Employee[] employers)
    {
        double sum = 0;
        for (int i = 0; i < employers.length; i++){
            sum += employers[i].getMonthlySalary();
        }
        return sum ;
    }


}
