package com.surajgautam.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Suraj Gautam.
 */
class GCDTest {

    @Test
    @DisplayName("GCD of 357,234 with naive algorithm")
    void givenInput_WhenNaiveAlgorithm_ThenReturnCorrectResult() {
        GCD gcd = new GCD(357,234);
        Assertions.assertEquals(3,gcd.calculateWithNaiveSolution());
    }

    @Test
    @DisplayName("GCD of ")
    void givenInput_WhenEuclideanAlgorithm_ThenReturnCorrectResult() {
    }
}