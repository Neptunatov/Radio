package ru.neptun.org;

public class Radio {


    private int maxWave = 10;
    private int minWave = 0;
    private int radioWave = minWave;

    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int numberOfStations;

    public Radio(int maxWave, int minWave, int maxVolume, int minVolume, int numberOfStations) {

        this.maxWave = maxWave;
        this.minWave = minWave;
        this.radioWave = minWave;

        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = minVolume;
        this.numberOfStations = (maxWave + 1) - minWave;
    }


    public int getStationsTotal() {
        return numberOfStations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int setMaxVolume() {
        currentVolume = maxVolume;
        return maxVolume;
    }

    public int setMinVolume() {
        currentVolume = minVolume;
        return minVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int getRadioWave() {
        return radioWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < minWave) {
            return;
        }
        if (newCurrentWave > maxWave) {
            return;
        }
        radioWave = newCurrentWave;
    }

    public int setMaxWave() {
        return maxWave;
    }

    public int setMinWave() {
        return minWave;
    }

    public int increaseWave() {
        if (radioWave >= maxWave) {
            return minWave;
        } else {
            radioWave = radioWave + 1;
            return radioWave;
        }
    }

    public int decreaseWave() {
        if (radioWave <= minWave) {
            radioWave = maxWave;
        } else {
            radioWave = radioWave - 1;
        }
        return radioWave;
    }
}
