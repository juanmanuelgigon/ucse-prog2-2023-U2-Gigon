package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorCombustibleTest {
    CalculadorCombustible calculador = CalculadorCombustible.getInstance();
    AvionPrivado privado = new AvionPrivado(50000, 180);
    AvionComercial comercial = new AvionComercial(120000,30);


    @Test
    void getInstance() {
        CalculadorCombustible calculador2 = CalculadorCombustible.getInstance();
        Assertions.assertSame(calculador, calculador2);
    }

    @Test
    void calcularCombustible() {
        Assertions.assertEquals(calculador.calcularCombustible(privado, 100), 43000);
        Assertions.assertEquals(calculador.calcularCombustible(comercial, 900), 27000);
    }
}