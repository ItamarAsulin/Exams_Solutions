package test;

import org.junit.jupiter.api.Test;
import test.PhoneNumber.*;
import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    @Test
    void checkInput() {
        PhoneNumber a = new PhoneNumber("03",1234567);
        assertTrue(a.checkInput());
        PhoneNumber b = new PhoneNumber("03",123456789);
        assertFalse(b.checkInput());
        PhoneNumber c = new PhoneNumber("032",123789);
        assertFalse(c.checkInput());

    }

    @Test
    void toSting() {
        PhoneNumber a = new PhoneNumber("03",1234567);
        String s = "03-1234567";
        assertEquals(a.toSting(), s);
    }
}