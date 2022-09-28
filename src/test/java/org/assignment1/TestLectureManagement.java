package org.assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLectureManagement {
    String name = "Caoimhe";
    int age = 21;

    Student student = new Student(name, age);
    Lecturer lecturer = new Lecturer("John", 35);

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
