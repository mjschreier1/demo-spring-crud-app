package com.demo.demospringcrudapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

@RestController
@RequestMapping("/math")
public class MathController {

    private MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/add")
    public Map<String, Long> doAdd(@RequestParam("firstTerm") long firstTerm, @RequestParam("secondTerm") long secondTerm) {
        return doMath(firstTerm, secondTerm, mathService::addIntegers);
    }

    @GetMapping("/subtract")
    public Map<String, Long> doSubtract(@RequestParam("firstTerm") long firstTerm, @RequestParam("secondTerm") long secondTerm) {
        return doMath(firstTerm, secondTerm, mathService::subtractIntegers);
    }

    @GetMapping("/multiply")
    public Map<String, Long> doMultiply(@RequestParam("firstTerm") long firstTerm, @RequestParam("secondTerm") long secondTerm) {
        return doMath(firstTerm, secondTerm, mathService::multiplyIntegers);
    }

    @GetMapping("/divide")
    public Map<String, Long> doDivide(@RequestParam("firstTerm") long firstTerm, @RequestParam("secondTerm") long secondTerm) {
        return doMath(firstTerm, secondTerm, mathService::divideIntegers);
    }

    private Map<String, Long> doMath(long firstTerm, long secondTerm, BiFunction<Long, Long, Long> mathMethod) {
        Map<String, Long> result = new HashMap<>();
        result.put("result", mathMethod.apply(firstTerm, secondTerm));
        return result;
    }
}
