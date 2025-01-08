package com.example.QuanLyTourDuLich.dto;


import java.util.List;

public class BieuDoDto {
    private List<String> labels;
    private List<Double> data;

    // Constructor
    public BieuDoDto() {
    }

    // Getters và Setters
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<Double> getData() {
        return data;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }
}