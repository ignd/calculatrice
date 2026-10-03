package net.esmtaql.parameterized;

import net.esmtaql.Jours;
import net.esmtaql.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnumSourceTest {

    @ParameterizedTest
    @EnumSource(value = Jours.class, names = {"LUNDI", "MARDI", "MERCREDI", "JEUDI", "VENDREDI"})
    void estJourTravailTest(Jours jour) {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.estJourTravail(jour));
    }

    @ParameterizedTest
    @EnumSource(value = Jours.class, names = {"SAMEDI", "DIMANCHE"})
    void estJourNonTravailleTest(Jours jour) {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.estJourTravail(jour));
    }
}
