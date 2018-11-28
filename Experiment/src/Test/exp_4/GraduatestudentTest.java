package exp_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraduatestudentTest {

    @Test
    public void study() {
        Graduatestudent student = new Graduatestudent();
        student.setName("大行风者");
        student.setOld(20);
        student.setMajor("计算机科学与技术");
        student.setAcademicDegree("本科");
        student.setResearchDirection("服务器高并发");
        student.Study();
    }
}