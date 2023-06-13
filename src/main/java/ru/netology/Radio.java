package ru.netology;

public class Radio {

    // Данные номера радиостанции
    int currentRadioStation;
    int minRadioStationNumber = 0;
    int maxRadioStationNumber = 9;

    // Данные громкости звука
    int currentVolumeOfTheRadio;
    int minVolumeOfTheRadio = 0;
    int maxVolumeOfTheRadio = 100;

    // Методы выбора номера станции
    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setNewRadioStation(int radioStation) {
        if (radioStation < minRadioStationNumber) {
            return;
        }
        if (radioStation > maxRadioStationNumber) {
            return;
        }
        currentRadioStation = radioStation;
    }

    public void next() {
        if (currentRadioStation == maxRadioStationNumber) {
            currentRadioStation = minRadioStationNumber;
        } else currentRadioStation = currentRadioStation + 1;
    }

    public void prev() {
        if (currentRadioStation == minRadioStationNumber) {
            currentRadioStation = maxRadioStationNumber;
        } else currentRadioStation = currentRadioStation - 1;
    }

    // Методы установки громкости
    public int getCurrentVolume() {
        return currentVolumeOfTheRadio;
    }

    public void setNewVolume(int newVolume) {
        if (newVolume < minVolumeOfTheRadio) {
            return;
        }
        if (newVolume > maxVolumeOfTheRadio) {
            return;
        }
        currentVolumeOfTheRadio = newVolume;
    }

    public void setVolumeUpOnePointUp() {
        if (currentVolumeOfTheRadio == maxVolumeOfTheRadio) {
            return;
        }
        currentVolumeOfTheRadio = currentVolumeOfTheRadio + 1;
    }

    public void setVolumeOnePointDown() {
        if (currentVolumeOfTheRadio == minVolumeOfTheRadio) {
            return;
        }
        currentVolumeOfTheRadio = currentVolumeOfTheRadio - 1;
    }
}
