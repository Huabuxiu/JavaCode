package exp_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class UndergraduateTest {

    @Test
    public void study() {
        Undergraduate student = new Undergraduate();
        student.setName("大行风者");
        student.setOld(20);
        student.setMajor("计算机科学与技术");
        student.setAcademicDegree("本科");
        student.Study();
    }
}