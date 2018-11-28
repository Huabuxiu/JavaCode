package exp_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void study() {
        Student student = new Student();
        student.setName("大行风者");
        student.setOld(20);
        student.Study();
    }
}