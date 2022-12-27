package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {

    @Test
    public void shouldRemainIfLess1000() {
        // подготовка данных, выполнение целевого действия, сравнение ожидаемого и фактического
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfMore1000() {
        // подготовка данных, выполнение целевого действия, сравнение ожидаемого и фактического
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRemainIfEquals1000() {
        // подготовка данных, выполнение целевого действия, сравнение ожидаемого и фактического
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}