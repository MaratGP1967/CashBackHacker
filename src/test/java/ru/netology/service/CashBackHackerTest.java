package ru.netology.service;

//import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CashBackHackerTest {

    @Test
    public void shouldRemainIfLess1000V() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfMore1000V() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRemainIfEquals1000V() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemainIfLess1000J() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemainIfMore1000J() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotRemainIfEquals1000J() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}