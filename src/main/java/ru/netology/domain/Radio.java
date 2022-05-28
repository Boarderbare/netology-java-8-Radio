package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNumberCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == 9)
            this.currentStation = 0;
        else
            this.currentStation = currentStation + 1;
    }

    public void setPrevStation() {
        if (currentStation == 0)
            this.currentStation = 9;
        else
            this.currentStation = currentStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume == 10)
            this.currentVolume = currentVolume;
        else
            this.currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume == 0)
            this.currentVolume = currentVolume;
        else
            this.currentVolume = currentVolume - 1;
    }
}
