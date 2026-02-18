package opgave01;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    @org.junit.jupiter.api.Test
    void beregnPraemie() {
        // Arrange
        BilForsikring bilForsikring1 = new BilForsikring();
        bilForsikring1.setGrundpaemie(100);
        // Act
        double praemie1 = bilForsikring1.beregnPraemie(30,false,10);
        double praemie2 = bilForsikring1.beregnPraemie(20,true,1);
        double praemie3 = bilForsikring1.beregnPraemie(18,false,0);
        double praemie4 = bilForsikring1.beregnPraemie(50,true,5);
        // Assert
        assertEquals(65,praemie1);
        assertEquals(118.75,praemie2);
        assertEquals(125,praemie3);
        assertEquals(80.75,praemie4);


    }

    // Arrange


    // Act

    // Assert
}