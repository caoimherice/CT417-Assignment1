package org.assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLectureManagement {

    Student student = new Student("Caoimhe", 21, "04/02/2001", "19408694");
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
