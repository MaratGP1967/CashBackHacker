package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackerTest {

    @Test
    void shouldRemainIfLess1000() {
        // подготовка данных, выполнение целевого действия, сравнение ожидаемого и фактического
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemainIfMore1000() {
        // подготовка данных, выполнение целевого действия, сравнение ожидаемого и фактического
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotRemainIfEquals1000() {
        // подготовка данных, выполнение целевого действия, сравнение ожидаемого и фактического
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}