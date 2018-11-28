package exp_4;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-19 15:26
 **/
public class Student {
    private String name;
    private  int old;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void Study()
    {
        System.out.println(
                        "name='" + name + '\'' +
                        ", old=" + old
        );
    }

}
