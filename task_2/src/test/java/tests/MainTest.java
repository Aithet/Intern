package tests;

import org.junit.jupiter.api.Test;

import static classes.Main.interviewRecursionTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void notNull() {
        String actual = "";
        if (actual.length() == 0){
            System.out.println("Error");
            assertTrue(actual.length() == 0, actual);
        }
        else {
            System.out.println(interviewRecursionTest(actual));
        }
    }

    @Test
    void compare() {
        String expected = "D*E*V*E*L*O*P*E*R";
        String actual = interviewRecursionTest("DEVELOPER");

        System.out.println(expected + " = " + actual);
        assertEquals(expected,actual);
    }
}