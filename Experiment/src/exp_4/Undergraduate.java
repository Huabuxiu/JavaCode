package exp_4;

/**
 * @program: Experiment
 * @description:本科生
 * @author: Huabuxiu
 * @create: 2018-11-19 15:28
 **/
public class Undergraduate extends Student {
    private  String major;
    private  String AcademicDegree;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAcademicDegree() {
        return AcademicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        AcademicDegree = academicDegree;
    }

    @Override
    public void Study() {
        super.Study();
        System.out.println( "major='" + major + '\'' +
                ", AcademicDegree='" + AcademicDegree + '\'' );
    }


}
