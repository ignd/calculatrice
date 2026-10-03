package net.esmtaql;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    private static Instant debut;
    private Calculatrice calculatrice;

    @BeforeAll
    static void avantTous() {
        debut = Instant.now();
        System.out.println(">>> Début de la campagne de tests : " + debut);
    }

    @AfterAll
    static void apresTous() {
        Instant fin = Instant.now();
        long duree = Duration.between(debut, fin).toMillis();
        System.out.println(">>> Fin de la campagne de tests : " + fin);
        System.out.println(">>> Durée totale des tests : " + duree + " ms");
    }

    @BeforeEach
    void avantChaque() {
        calculatrice = new Calculatrice();
        System.out.println("   [BeforeEach] Nouvelle instance de Calculatrice créée.");
    }

    @AfterEach
    void apresChaque() {
        calculatrice = null;
        System.out.println("   [AfterEach] Référence du calculateur mise à null.");
    }

    @Test
    public void testAdditionnerDeuxNombresPositifs() {
        // Arrange
        int nombre1 = 10;
        int nombre2 = 25;
        // Act
        int résultatObtenu = calculatrice.add(nombre1, nombre2);

        // Assert
        assertEquals(35, résultatObtenu);
    }

    @Test
    public void testSoustraireDeuxNombresPositifs() {
        // Arrange
        int nombre1 = 10;
        int nombre2 = 25;
        // Act
        int résultatObtenu = calculatrice.subtract(nombre1, nombre2);

        // Assert
        assertEquals(-15, résultatObtenu);
    }

    @Test
    public void testMultiplierDeuxNombresPositifs() {
        // Arrange
        int nombre1 = 10;
        int nombre2 = 25;
        // Act
        int résultatObtenu = calculatrice.multiply(nombre1, nombre2);

        // Assert
        assertEquals(250, résultatObtenu);
    }

    @Test
    public void testDiviserDeuxNombresPositifs() {
        // Arrange
        double nombre1 = 10;
        double nombre2 = 25;
        // Act
        double résultatObtenu = calculatrice.divide(nombre1, nombre2);

        // Assert
        assertEquals(0.4, résultatObtenu, 0.0001);
    }

    @Test
    public void testDiviserParZeroLeveUneException() {
        // Arrange

        // Act + Assert
        assertThrows(ArithmeticException.class, () -> calculatrice.divide(10, 0));
    }
}
