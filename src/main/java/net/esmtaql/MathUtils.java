package net.esmtaql;

public class MathUtils {

    public boolean estPair(int nombre) {
        return nombre % 2 == 0;
    }

    public boolean estJourTravail(Jours jour) {
        return jour != Jours.SAMEDI && jour != Jours.DIMANCHE;
    }

    public long factoriel(int nombre) {
        int résultat = 1;
        for (int i = 1; i <= nombre; i++) {
            résultat = résultat * i;
        }
        return résultat;
    }
}
