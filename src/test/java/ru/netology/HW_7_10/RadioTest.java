package ru.netology.HW_7_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.currentStation = 2;

        int expected = 2;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 30;

        int expected = 30;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}