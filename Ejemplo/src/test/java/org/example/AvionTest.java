package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionTest {
    AvionPrivado privado = new AvionPrivado(50000, 180);

    @Test
    void volar() {
        Assertions.assertEquals(privado.volar(100), 43000);
    }

    @Test
    void getCapacidadCombustible() {
        Assertions.assertEquals(privado.getCapacidadCombustible(), 50000);
        Assertions.assertNotNull(privado.getCapacidadCombustible());
    }

    @Test
    void getConsumoCombustible() {
        Assertions.assertEquals(privado.getConsumoCombustible(), 180);
        Assertions.assertNotNull(privado.getConsumoCombustible());
    }
}