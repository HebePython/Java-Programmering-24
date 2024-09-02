package Java_playground.Junit_testing_Java;

import static org.junit.jupiter.api.Assertions.assertEquals; 

import org.junit.jupiter.api.Test;

import Java_playground.java_test.Uppgift3;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;

class Uppgift3Test {

    Uppgift3 uppgift3;

    @BeforeEach
    void setUp() {
        uppgift3 = new Uppgift3();
    }

    @Test
    void testEvalNumberPositive() {
        assertEquals("positive", Uppgift3.evalNumber(3.14));
    }

    @Test
    void testEvalNumberNegative() {
        assertEquals("negative", Uppgift3.evalNumber(-2.718));
    }

    @Test
    void testEvalNumberZero() {
        assertEquals("0", Uppgift3.evalNumber(0.0));
    }

    @Test
    void testEvalNumberSizeBig() {
        assertEquals("big", Uppgift3.evalNumberSize(1000001));
    }

    @Test
    void testEvalNumberSizeSmall() {
        assertEquals("small", Uppgift3.evalNumberSize(0.5));
    }

    @Test
    void testEvalNumberSizeMedium() {
        assertEquals("", Uppgift3.evalNumberSize(500000));
    }

    @Test
    void testEvalNumberSizeSmallFail() {  // TODO remake into exception test.
        assertEquals("", Uppgift3.evalNumberSize(3500));
    }
}
