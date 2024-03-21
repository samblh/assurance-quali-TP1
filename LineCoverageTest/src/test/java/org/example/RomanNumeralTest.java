package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.example.RomanNumeralCorrection.toRoman;
public class RomanNumeralTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv",numLinesToSkip = 1)
    void TestToRoman(int input, String expectedValue){
        Assertions.assertEquals(expectedValue, toRoman(input));
    }
    @Test
    void numberOutOfBoundriesShouldThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> toRoman(0));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> toRoman(4000));
    }
}

