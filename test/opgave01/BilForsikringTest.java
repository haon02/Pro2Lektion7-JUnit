package opgave01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {


    @Test
    void beregnPraemieHvisGrundPrEr0(){
        BilForsikring bilForsikring = new BilForsikring();
        assertThrows(RuntimeException.class, ()-> bilForsikring.beregnPraemie(18,true,3));
    }


    @Test
    void beregnPraemieUngMand() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(100);
        // Act
        double præmie = bilForsikring.beregnPraemie(20, false, 2);
        // Assert
        assertEquals(125, præmie);
    }

    @Test
    void beregnPraemie25ÅrMand() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(100);
        // Act
        double præmie = bilForsikring.beregnPraemie(25, false, 2);
        // Assert
        assertEquals(100, præmie);
    }

    @Test
    void beregnPraemieVoksenMand() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(100);
        // Act
        double præmie = bilForsikring.beregnPraemie(30, false, 2);
        // Assert
        assertEquals(100, præmie);
    }

    @Test
    void beregnPraemieVoksenMandSkadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(100);
        // Act
        double præmie = bilForsikring.beregnPraemie(30, false, 10);
        // Assert
        assertEquals(65, præmie);
    }

    @Test
    void beregnPraemieVoksenMandSkadefri6() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(100);
        // Act
        double præmie = bilForsikring.beregnPraemie(30, false, 6);
        // Assert
        assertEquals(75, præmie);
    }


    @Test
    void beregnPraemieUngKvinde() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(100);
        // Act
        double præmie = bilForsikring.beregnPraemie(20, true, 2);
        // Assert
        assertEquals(118.75, præmie);
    }

    @Test
    void beregnPraemie25ÅrKvinde() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(100);
        // Act
        double præmie = bilForsikring.beregnPraemie(25, true, 2);
        // Assert
        assertEquals(95, præmie);
    }

    @Test
    void beregnPramieVoksenKvinde() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(100);
        // Act
        double praemie = bilForsikring.beregnPraemie(30, true, 2);
        // Assert
        assertEquals(95, praemie);
    }

    @Test
    void beregnPraemieVoksenKvindeSkadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(100);
        // Act
        double præmie = bilForsikring.beregnPraemie(30, true, 10);
        // Assert
        assertEquals(61.75, præmie);
    }


// Den fejler jo som den skal, 20 år + 10 skadefri
//    @Test
//    void beregnPraemieUngMandSkadefri() {
//        // Arrange
//        BilForsikring bilForsikring = new BilForsikring();
//        bilForsikring.setGrundpaemie(100);
//        // Act
//        double præmie = bilForsikring.beregnPraemie(20, false, 10);
//        // Assert
//        assertEquals(65, præmie);
//    }

}