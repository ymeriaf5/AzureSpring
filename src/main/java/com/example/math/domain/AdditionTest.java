package com.example.math.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    public void testTotal() {
        Addtion addition = new Addtion();
        addition.setNum1(5);
        addition.setNum2(7);
        int result = addition.Total();
        Assertions.assertEquals(12, result);
    }

    @Test
    public void testSubtract() {
        Addtion addition = new Addtion();
        addition.setNum1(8);
        addition.setNum2(3);
        int result = addition.subtract();
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        Addtion addition = new Addtion();
        addition.setNum1(4);
        addition.setNum2(6);
        int result = addition.multiply();
        Assertions.assertEquals(24, result);
    }
}
