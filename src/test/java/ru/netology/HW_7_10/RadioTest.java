package ru.netology.HW_7_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.currentStation = 9;

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущая радиостанция " + radio.currentStation);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.currentStation = 9;
        radio.setNextStation();

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
        System.out.println("Следующая радиостанция " + radio.currentStation);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.currentStation = 9;
        radio.setPrevStation();


        int expected = 8;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
        System.out.println("Предыдущая радиостанция " + radio.currentStation);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 30;

        int expected = 30;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущий уровень громкости  " + radio.currentVolume);
    }

}