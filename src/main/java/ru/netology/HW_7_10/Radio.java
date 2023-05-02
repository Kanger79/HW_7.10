package ru.netology.HW_7_10;
public class Radio {
    public int currentStation;
    public int currentVolume;
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume ++;
        }
    }


}
