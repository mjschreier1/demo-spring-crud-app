package com.demo.demospringcrudapp;

/**
 * Does basic math functions; does NOT handle edge cases
 */
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
