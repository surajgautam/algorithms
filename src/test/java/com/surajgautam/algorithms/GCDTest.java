package com.surajgautam.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Suraj Gautam.
 */
class GCDTest {

    private GCD gcd;

    @BeforeEach
    void setUp() {
        gcd = new GCD();
    }

    @Test
    @DisplayName("GCD of 357,234 by naive algorithm")
    void givenInput_WhenNaiveAlgorithm_ThenReturnCorrectResult() {
        assertEquals(3,gcd.calculateWithNaiveSolution(357,234));
    }

    @Test
    @DisplayName("GCD of 3918848, 1653264 by euclidean")
    void givenInput_WhenEuclideanAlgorithm_ThenReturnCorrectResult() {
        assertEquals(61232,gcd.calculateWithEuclideanAlgorithm(3918848, 1653264));
    }
}