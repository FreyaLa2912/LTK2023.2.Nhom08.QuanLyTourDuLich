package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.Tour;
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
}

