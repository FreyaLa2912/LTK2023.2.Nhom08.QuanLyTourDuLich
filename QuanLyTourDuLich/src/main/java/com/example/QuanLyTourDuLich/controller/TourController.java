package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.LichTrinhTour;
import com.example.QuanLyTourDuLich.entity.Tour;
import com.example.QuanLyTourDuLich.service.LichTrinhTourService;
import com.example.QuanLyTourDuLich.service.TourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
public class TourController {

    @Autowired
    private TourService tourService;
    @Autowired
    private LichTrinhTourService lichTrinhTourService; 

    @GetMapping
    public ResponseEntity<List<Tour>> getAllTours() {
        List<Tour> tours = tourService.getAllTours();
        return new ResponseEntity<>(tours, HttpStatus.OK);
    }

    @GetMapping("/{maTour}")
    public ResponseEntity<Tour> getTourById(@PathVariable int maTour) {
        Tour tour = tourService.getTourById(maTour);
        if (tour != null) {
            return new ResponseEntity<>(tour, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Tour> createTour(@RequestBody Tour tour) {
        Tour createdTour = tourService.createTour(tour);
        return new ResponseEntity<>(createdTour, HttpStatus.CREATED);
    }

    @PutMapping("/{maTour}")
    public ResponseEntity<Tour> updateTour(@PathVariable int maTour, @RequestBody Tour tour) {
        Tour updatedTour = tourService.updateTour(maTour, tour);
        if (updatedTour != null) {
            return new ResponseEntity<>(updatedTour, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maTour}")
    public ResponseEntity<Void> deleteTour(@PathVariable int maTour) {
        tourService.deleteTour(maTour);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Trong TourController.java

    @GetMapping("/{maTour}/lichtrinhtours")
    public ResponseEntity<List<LichTrinhTour>> getLichTrinhToursByMaTour(@PathVariable int maTour) {
        try {
            List<LichTrinhTour> lichTrinhTours = lichTrinhTourService.getLichTrinhToursByMaTour(maTour);
            return new ResponseEntity<>(lichTrinhTours, HttpStatus.OK);
        } catch (Exception e) {
            // Xử lý exception (ví dụ: log lỗi, trả về thông báo lỗi cụ thể)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

