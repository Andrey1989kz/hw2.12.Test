package service;

import execpion.CalculatorZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static service.Constant.*;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void plusOneAndOne() {
        int result = calculatorService.plus(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
    public void plusOneAndTwo() {
        int result = calculatorService.plus(ONE, TWO);
        assertEquals(ONE + TWO, result);
    }

    @Test
    public void minusTwoAndOne() {
        int result = calculatorService.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
    public void minusThreeAndTwo() {
        int result = calculatorService.minus(THREE, TWO);
        assertEquals(THREE - TWO, result);
    }

    @Test
    public void multiplyThreeAndTwo() {
        int result = calculatorService.multiply(THREE, TWO);
        assertEquals(THREE * TWO, result);
    }

    @Test
    public void multiplyThreeAndOne() {
        int result = calculatorService.multiply(THREE, ONE);
        assertEquals(THREE * ONE, result);
    }

    @Test
    public void divideThreeAndOne() {
        int result = calculatorService.divide(THREE, ONE);
        assertEquals(THREE / ONE, result);
    }

    @Test
    public void divideThreeAndTwo() {
        int result = calculatorService.divide(THREE, TWO);
        assertEquals(THREE / TWO, result);
    }

    @Test
    public void zeroException() {
        assertThrows(CalculatorZeroException.class,
                () -> calculatorService.divide(ONE, ZERO));
    }
}