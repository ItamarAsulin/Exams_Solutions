package test;

import org.junit.jupiter.api.Test;
import test.Student;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testToString() {
        Student a = new Student("josef", 22, 35.6);
        System.out.println(a.toString());
    }

    @Test
    void testEquals() {
        Student a = new Student("josef", 22, 35.6);
        Student b = new Student("yoni", 22, 35.0);
        assertFalse(a.equals(b));
    }
}