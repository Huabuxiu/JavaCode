package inheritance;
public class Manager extends Employee {
    private double bonus;

/**
 * @param n the employee's name
 * @param s the salary
 * @param  year the hire mothe
 * @param day the hire day
 */

    public Manager (String n,double s, int year, int mouth,int day)
    {
        super(n,s,year,mouth,day);
        bonus = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
    

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
