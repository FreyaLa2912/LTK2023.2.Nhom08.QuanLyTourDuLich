package com.example.QuanLyTourDuLich.dto;


public class TopTourDto {
    private String tenTour;
    private int soLuotDat;

    // Constructor
    public TopTourDto() {
    }

    // Getters và Setters
    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public int getSoLuotDat() {
        return soLuotDat;
    }

    public void setSoLuotDat(int soLuotDat) {
        this.soLuotDat = soLuotDat;
    }
}
