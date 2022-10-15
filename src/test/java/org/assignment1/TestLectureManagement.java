package org.assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLectureManagement {

    Student student = new Student("Caoimhe", 21, "04/02/2001", "19408694");
    Lecturer lecturer = new Lecturer("John", 35, "02/03/1980", "12345678");

    public TestLectureManagement() {
    }

    // test to check if the generate username method in Student correctly concatenates their name and age to get their username
    @Test
    public void testGenerateUsernameStudent(){
        assertEquals("Caoimhe21", student.getUsername());
    }

    // test to check if the generate username method in Lecturer correctly concatenates their name and age to get their username
    @Test
    public void testGenerateUsernameLecturer(){
        assertEquals("John35", lecturer.getUsername());
    }
}
