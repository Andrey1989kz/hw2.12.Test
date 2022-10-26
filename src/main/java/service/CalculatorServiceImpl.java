package service;

import execpion.CalculatorZeroException;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer plus(Integer x, Integer y) {
        return x + y;
    }

    @Override
    public int minus(Integer x, Integer y) {
        return x - y;
    }

    @Override
    public int multiply(Integer x, Integer y) {
        return x * y;
    }

    @Override
    public int divide(Integer x, Integer y) {
        if (y == 0) {
            throw new CalculatorZeroException();
        }
        return x / y;
    }

    @Override
    public String checkNull(Integer x, Integer y) {
        if (x == null || y == null) {
        return "проверьте все значения";
        }
        return null;
    }
}
