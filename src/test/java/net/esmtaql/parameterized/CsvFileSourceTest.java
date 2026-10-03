package net.esmtaql.parameterized;

import net.esmtaql.MathUtils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvFileSourceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/factorial_data.csv")
    void factorialTestUsingCsvFileSource(int number, int expected) {
        MathUtils mathUtils = new MathUtils();
        assertEquals(expected, mathUtils.factoriel(number));
    }
}
