package challenge3.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;



class CetakTest {

    @Test
    public void testPrintFrekuensiTxt() {
        Cetak.printFrekeunsiTxt();
        File file = new File("C:\\temp\\direktori\\Modus.txt");
        assertTrue(file.exists());
        assertTrue(file.isFile());
        assertTrue(file.length() > 0);
    }




}