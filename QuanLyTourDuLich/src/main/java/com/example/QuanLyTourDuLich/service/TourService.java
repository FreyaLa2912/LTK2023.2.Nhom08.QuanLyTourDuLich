package com.example.QuanLyTourDuLich.service;

import com.example.QuanLyTourDuLich.model.Tour;
import com.example.QuanLyTourDuLich.repository.TourRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;

    public List<Tour> getAllTours() {
        return tourRepository.findAll();
    }
}
