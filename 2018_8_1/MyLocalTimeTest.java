package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLocalTimeTest {

    @Test
    void testToString() {
        MyLocalTime lt = new MyLocalTime("Ashdod", 2, new Clock(10, 52));

        MyLocalTime lt2 = new MyLocalTime(lt);
        assertNotEquals(lt, lt2);
    }

    @Test
    void testEquals() {
        MyLocalTime lt = new MyLocalTime("Ashdod", 2, new Clock(10, 52));
        MyLocalTime lt2 = new MyLocalTime(lt);
      assertTrue(lt.equals(lt2));
    }
}