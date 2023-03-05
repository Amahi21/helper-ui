package com.example.common;

public class Currensies {
    private Double USD;
    private Double EUR;
    private Double JPY;

    public Currensies(Double RUB) {
        this.USD = RUB / 75.4;
        this.EUR = RUB / 80.3;
        this.JPY = RUB / 1.8;
    }

    public Double getUSD() {
        return USD;
    }

    public void setUSD(Double USD) {
        this.USD = USD;
    }

    public Double getEUR() {
        return EUR;
    }

    public void setEUR(Double EUR) {
        this.EUR = EUR;
    }

    public Double getJPY() {
        return JPY;
    }

    public void setJPY(Double JPY) {
        this.JPY = JPY;
    }


}
