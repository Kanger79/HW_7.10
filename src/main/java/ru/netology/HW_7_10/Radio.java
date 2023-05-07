package ru.netology.HW_7_10;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
        }
        if (newCurrentStation < 0) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextStation(int newCurrentStation) {
        setCurrentStation(currentStation);
        if (newCurrentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void increaseVolume() {
        int newVolume = currentVolume + 1;
        if (newVolume > 100) {
            newVolume = 100;
        }
        currentVolume = newVolume;
    }

    public void setPrevStation(int newCurrentStation) {
        setCurrentStation(currentStation);
        if (newCurrentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void decreaseVolume() {
        int newVolume = currentVolume - 1;
        if (newVolume < 0) {
            newVolume = 0;
        }
        currentVolume = newVolume;
    }
}
