package net.esmtaql.parameterized;

import net.esmtaql.MathUtils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvSourceTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120"
    })
    void factorialTest(int number, int expected) {
        MathUtils mathUtils = new MathUtils();
        assertEquals(expected, mathUtils.factoriel(number));
    }
}
