package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionPrivadoTest {
    AvionPrivado privado = new AvionPrivado(50000, 180);

    @Test
    void volar() {
        Assertions.assertEquals(43000, privado.volar(100));
    }
    @Test
    void getCombustible() {Assertions.assertEquals(180, privado.getConsumoCombustible());}

}