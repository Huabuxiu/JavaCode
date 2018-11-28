package exp_4;

/**
 * @program: Experiment
 * @description:研究生
 * @author: Huabuxiu
 * @create: 2018-11-19 15:32
 **/
public class Graduatestudent extends Undergraduate{
    private String ResearchDirection;

    public String getResearchDirection() {
        return ResearchDirection;
    }

    public void setResearchDirection(String researchDirection) {
        ResearchDirection = researchDirection;
    }

    @Override
    public void Study() {
        super.Study();
        System.out.println("ResearchDirection='" + ResearchDirection + '\'');
    }

}
