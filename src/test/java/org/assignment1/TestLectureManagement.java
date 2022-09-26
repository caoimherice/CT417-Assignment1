package org.assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.assignment1.lecturer;
import org.assignment1.module;
import org.assignment1.student;
import org.assignment1.programme;
import org.joda.time.DateTime;

public class TestLectureManagement {
    String name = "Caoimhe";
    int age = 21;

    student student = new student(name, age);

    public TestLectureManagement() {
    }

    @Test
    public void testGenerateUsername(){
        assertEquals("Caoimhe21", student.getUsername());
    }
}
