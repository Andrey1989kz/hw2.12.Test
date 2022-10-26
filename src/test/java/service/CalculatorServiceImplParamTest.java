package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.apache.coyote.http11.Constants.a;
import static org.junit.jupiter.api.Assertions.*;
import static service.Constant.*;

public class CalculatorServiceImplParamTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideCalculator")
    public void sumCorrect(int x, int y) {
        int result = calculatorService.plus(x, y);
        assertEquals(x + y, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculator")
    public void minusCorrect(int x, int y) {
        int result = calculatorService.minus(x, y);
        assertEquals(x - y, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculator")
    public void multiplyCorrect(int x, int y) {
        int result = calculatorService.multiply(x, y);
        assertEquals(x * y, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculator")
    public void divideCorrect(int x, int y) {
        int result = calculatorService.divide(x, y);
        assertEquals(x / y, result);
    }


    private static Stream<Arguments> provideCalculator() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(THREE, THREE),
                Arguments.of(ZERO, THREE)
        );
    }
}
