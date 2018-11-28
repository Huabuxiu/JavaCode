package exp_5;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-28 09:10
 **/
public class manager extends Employee{
    private String JobAttribute;
    private String AnnualSalary;

    public manager(String name, int age, String sex, String jobAttribute, String annualSalary) {
        super(name, age, sex);
        JobAttribute = jobAttribute;
        AnnualSalary = annualSalary;
    }

    @Override
    public String toString() {

        return super.toString()+"\n"+"manager{" +
                "JobAttribute='" + JobAttribute + '\'' +
                ", AnnualSalary='" + AnnualSalary + '\'' +
                '}';
    }
}
