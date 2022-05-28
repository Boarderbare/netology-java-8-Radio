package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    void shouldNotSetCurrentStationMoreNine() {
        rad.setNumberCurrentStation(33);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentStationLessZero() {
        rad.setNumberCurrentStation(-222);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationNext() {
        rad.setNumberCurrentStation(5);
        rad.setNextStation();
        int actual = rad.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationPrev() {
        rad.setNumberCurrentStation(6);
        rad.setPrevStation();
        int actual = rad.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationPrevFromZero() {
        rad.setNumberCurrentStation(0);
        rad.setPrevStation();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationFromNine() {
        rad.setNumberCurrentStation(9);
        rad.setNextStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeMore() {
        rad.setCurrentVolume(5);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeLess() {
        rad.setCurrentVolume(5);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeNoMore() {
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeNoLess() {
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}