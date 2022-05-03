package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testCompareToEquals() {
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Assertions.assertEquals(0, vitalik.compareTo(vitalik));
    }

    @Test
    public void testCompareToBigger() {
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Employee kuzia = new FrontEnd("Kuzia", "Goroshek");
        Assertions.assertTrue(vitalik.compareTo(kuzia) > 0);
    }

    @Test
    public void testCompareToSmaller() {
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Employee kuzia = new FrontEnd("Kuzia", "Goroshek");
        Assertions.assertTrue(kuzia.compareTo(vitalik) < 0);
    }
}
