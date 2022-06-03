package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void shouldSetMaxNumberStationDefault(){
        Radio rad = new Radio();
        int actual = rad.getMaxNumberStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void shouldNotSetCurrentStationMoreMaxCountStation() {
        Radio rad = new Radio(25);
        rad.setNumberCurrentStation(33);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentStationLessZero() {
        Radio rad = new Radio(25);
        rad.setNumberCurrentStation(-222);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationNext() {
        Radio rad = new Radio(25);
        rad.setNumberCurrentStation(17);
        rad.setNextStation();
        int actual = rad.getCurrentStation();
        int expected = 18;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationPrev() {
        Radio rad = new Radio(25);
        rad.setNumberCurrentStation(20);
        rad.setPrevStation();
        int actual = rad.getCurrentStation();
        int expected = 19;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationPrevFromZero() {
        Radio rad = new Radio(25);
        rad.setNumberCurrentStation(0);
        rad.setPrevStation();
        int actual = rad.getCurrentStation();
        int expected = rad.getMaxNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationFromMaxNumber() {
        Radio rad = new Radio(25);
        rad.setNumberCurrentStation(rad.getMaxNumberStation());
        rad.setNextStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeMore() {
        Radio rad = new Radio();
        rad.setCurrentVolume(55);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 56;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeLess() {
        Radio rad = new Radio();
        rad.setCurrentVolume(66);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 65;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeNoMore() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeNoLess() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

}