package opgave02;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Bibliotek {
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        long days = DAYS.between(beregnetDato, faktiskDato);
        if (days == 0) {
            return 0;
        } else if (days < 8) {
            return voksen ? 20 : 10;
        } else if (days <= 14) {
            return voksen ? 60 : 30;
        } else {
            return voksen ? 90 : 45;
        }
    }
}
