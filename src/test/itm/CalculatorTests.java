package itm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import itm.oss.Calculator;

@DisplayName("Calculator tests of OSS class")
public class CalculatorTests {

    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("Test for add function")
    void add() {
        assertEquals(10, calc.add(5, 5), "Expected value is 10 in add function");
    }

    @Test
    @DisplayName("Testing function isPrime")
    void isFivePrime(){
        assertTrue(calc.isPrime(5), "5 is prime");
    }

    @Test
    @DisplayName("Testing function isPrime {4}")
    void isFourPrime(){
        assertFalse(calc.isPrime(4), "4 is not prime");
    }
}
