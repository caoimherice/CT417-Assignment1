package org.assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLectureManagement {
    String name = "Caoimhe";
    int age = 21;
    String dob = "04/02/2001";
    String id = "19408694";


    Student student = new Student(name, age, dob, id);
    Lecturer lecturer = new Lecturer("John", 35, "02/03/1980", "12345678");

    public TestLectureManagement() {
    }

    @Test
    public void testGenerateUsernameStudent(){
        assertEquals("Caoimhe21", student.getUsername());
    }

    @Test
    public void testGenerateUsernameLecturer(){
        assertEquals("John35", lecturer.getUsername());
    }
}
