package com.demo.demospringcrudapp;

import org.springframework.stereotype.Service;

/**
 * Does basic math functions; does NOT handle edge cases
 */
@Service
public class MathService {
    public long addIntegers(long a, long b) {
        return a + b;
    }

    public long subtractIntegers(long a, long b) {
        return a - b;
    }

    public long multiplyIntegers(long a, long b) {
        return a * b;
    }

    public long divideIntegers(long a, long b) {
        return a / b;
    }
}
