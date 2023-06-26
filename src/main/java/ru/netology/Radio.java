package ru.netology;

public class Radio {

    // Данные номера радиостанции
    private final int minRadioStationNumber = 0;
    // Данные громкости звука
    private final int minVolumeOfTheRadio = 0;
    private final int maxVolumeOfTheRadio = 100;
    private int maxRadioStationNumber = 9;
    private int currentRadioStation = minRadioStationNumber;
    private int currentVolumeOfTheRadio = minVolumeOfTheRadio;

    // конструктор радио по умолчанию
    public Radio() {
    }

    // конструктор customized radio
    public Radio(int RangeOfStations) {

        this.maxRadioStationNumber = minRadioStationNumber + RangeOfStations - 1;
    }

    //геттеры класса радио - номер радиостанции
    public int getMinRadioStationNumber() {

        return minRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {

        return maxRadioStationNumber;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    //геттеры класса радио - уровень звука
    public int getMinVolumeOfTheRadio() {

        return minRadioStationNumber;
    }

    public int getMaxVolumeOfTheRadio() {

        return maxVolumeOfTheRadio;
    }

    public int getCurrentVolumeOfTheRadio() {

        return currentVolumeOfTheRadio;
    }

    // Методы выбора номера станции
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
