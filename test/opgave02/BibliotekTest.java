package opgave02;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {

    @Test
    void test_beregnBøde_0dage_barn() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 1);
        boolean voksen = false;
        //Act
        int expected = 0;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_0dage_voksen() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 2);
        boolean voksen = true;
        //Act
        int expected = 20;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_1dage_barn() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 2);
        boolean voksen = false;
        //Act
        int expected = 10;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_1dage_voksen() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 2);
        boolean voksen = true;
        //Act
        int expected = 20;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_7dage_barn() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 8);
        boolean voksen = false;
        //Act
        int expected = 10;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_7dage_voksen() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 8);
        boolean voksen = true;
        //Act
        int expected = 20;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_8dage_barn() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 9);
        boolean voksen = false;
        //Act
        int expected = 30;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_8dage_voksen() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 9);
        boolean voksen = true;
        //Act
        int expected = 60;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_14dage_voksen() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 15);
        boolean voksen = true;
        //Act
        int expected = 60;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_14dage_barn() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 15);
        boolean voksen = false;
        //Act
        int expected = 30;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    void test_beregnBøde_15dage_voksen() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 17);
        boolean voksen = true;
        //Act
        int expected = 90;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_beregnBøde_15dage_barn() {
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026, 5, 1);
        LocalDate faktiskDato = LocalDate.of(2026, 5, 16);
        boolean voksen = false;
        //Act
        int expected = 45;
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);
        //Assert
        assertEquals(expected, actual);
    }


}
