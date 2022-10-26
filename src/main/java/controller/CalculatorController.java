package controller;

import execpion.CalculatorZeroException;
import service.CalculatorServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequestMapping(value = "/calculator")
public class CalculatorController {

    private CalculatorServiceImpl calculatorService;

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer x,
                       @RequestParam(name = "num2", required = false) Integer y) {
        int plus = calculatorService.plus(x, y);
        return x + "+" + y + "=" + plus;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer x,
                        @RequestParam(name = "num2", required = false) Integer y) {
        int minus = calculatorService.minus(x, y);
        return x + "-" + y + "=" + minus;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer x,
                           @RequestParam(name = "num2", required = false) Integer y) {
        calculatorService.checkNull(x, y);
        int multiply = calculatorService.multiply(x, y);
        return x + "*" + y + "=" + multiply;
    }

     @GetMapping(path = "/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer x,
                         @RequestParam(name = "num2", required = false) Integer y) {
        double divide = calculatorService.divide(x, y);
        return x + "/" + y + "=" + divide;
    }
}

