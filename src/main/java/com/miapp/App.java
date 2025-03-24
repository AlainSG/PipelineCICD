package com.miapp;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(10, 5);
        System.out.println("Resultado de la suma:" + resultado);
    }
}
