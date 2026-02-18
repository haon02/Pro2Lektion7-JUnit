package opgave01;

public class BilForsikring {
    private double grundPraemie;

    public double getGrundPraemie() {
        return grundPraemie;
    }

    public void setGrundpaemie(double grundPr) {
        if (grundPr <= 0) {
            throw new RuntimeException("grundPr skal være positiv");
        }
        grundPraemie = grundPr;
    }

    public double beregnPraemie(int alder, boolean isKvinde, int skadeFrieaer) {
        double praemie = grundPraemie;
        if (praemie == 0) {
            throw new RuntimeException("GrundPræmie har ikke fået en værdi");
        }
        if (alder < 18) {
            throw new RuntimeException("Du er for ung til at tegne en forsikring");
        }
        if (alder - skadeFrieaer < 18) {
            throw new RuntimeException("Du kan ikke have kørt skadefri så længe...");
        }
        if (skadeFrieaer < 0) {
            throw new RuntimeException("Antal skadefrie år skal være positiv");
        }
        if (alder < 25) {
            praemie = 1.25 * grundPraemie;
        }
        if (isKvinde) {
            praemie = praemie * 0.95;
        }
        if (skadeFrieaer < 3) {
        } else if (skadeFrieaer < 6) {
            praemie = praemie * 0.85;
        } else if (skadeFrieaer < 9) {
            praemie = praemie * 0.75;
        } else {
            praemie = praemie * 0.65;
        }
        return praemie;
    }
}

