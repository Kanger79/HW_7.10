package ru.netology.HW_7_10;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume () {
        return currentVolume; }

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
        if (newCurrentVolume <0) {
            newCurrentVolume =0;
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

    public void setIncreaseVolume(int newCurrentVolume) {
        setCurrentVolume(currentVolume);
        if (newCurrentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume = currentVolume +1;
        }

    }

    public void setPrevStation(int newCurrentStation) {
        setCurrentStation(currentStation);
        if (newCurrentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setDecreaseVolume(int newCurrentVolume) {
        setCurrentVolume(currentVolume);
        if (newCurrentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}
