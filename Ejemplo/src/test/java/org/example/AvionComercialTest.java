package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionComercialTest {
    private AvionComercial comercial = new AvionComercial(120000,30);

    @Test
    public void volar() {
        Assertions.assertEquals(27000,comercial.volar(900));

    }
}