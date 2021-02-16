package com.sd3.calculator.controller;

import com.sd3.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @RequestMapping("/sum")
    public String sum (@RequestParam("a") Integer a,
                       @RequestParam("b") Integer b){
        return String.valueOf(calculatorService.sum(a, b));
    }
}
