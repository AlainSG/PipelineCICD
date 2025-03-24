package com.miapp;

import org.junit.jupiter.api.Test; // JUnit 5
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.sumar(10, 5), "10 + 5 debería ser 15");
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.restar(10, 5), "10 - 5 debería ser 5");
    }

}
