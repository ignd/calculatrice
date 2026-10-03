package net.esmtaql.parameterized;

import net.esmtaql.MathUtils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void estPairTest(int nombre) {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.estPair(nombre));
    }
}
