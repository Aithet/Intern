package tests;


import classes.Cipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {

    @Test
    public void encode() {
        assertEquals("00 0 0 0 00 000 0 000", Cipher.encrypt("G"));

        assertEquals("00 0 0 0 00 000 0 00000 0 0 0 00 00 0 0000", Cipher.encrypt("GO"));
    }

}
