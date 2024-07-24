package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        PrintStream salida = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] args = {};
        Main principal = new Main();
        principal.main(args);
        System.setOut(salida);

        Assertions.assertEquals("Hello world!\n", outputStream.toString());
    }

}