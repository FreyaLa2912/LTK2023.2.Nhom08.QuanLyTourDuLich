package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.Tour_Turn;
import com.example.QuanLyTourDuLich.service.Tour_TurnService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tour_turns")
public class Tour_TurnController {

    @Autowired
    private Tour_TurnService tour_turnService;

    @GetMapping
    public ResponseEntity<List<Tour_Turn>> getAllTour_Turns() {
        List<Tour_Turn> tour_turns = tour_turnService.getAllTour_Turns();
        return new ResponseEntity<>(tour_turns, HttpStatus.OK);
    }

    @GetMapping("/{maTour}/{turn}")
    public ResponseEntity<Tour_Turn> getTour_TurnById(@PathVariable int maTour, @PathVariable int turn) {
        Tour_Turn tour_turn = tour_turnService.getTour_TurnById(maTour, turn);
        if (tour_turn != null) {
            return new ResponseEntity<>(tour_turn, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Tour_Turn> createTour_Turn(@RequestBody Tour_Turn tour_turn) {
        Tour_Turn createdTour_Turn = tour_turnService.createTour_Turn(tour_turn);
        return new ResponseEntity<>(createdTour_Turn, HttpStatus.CREATED);
    }

    @PutMapping("/{maTour}/{turn}")
    public ResponseEntity<Tour_Turn> updateTour_Turn(
            @PathVariable int maTour, 
            @PathVariable int turn, 
            @RequestBody Tour_Turn tour_turn) {
        Tour_Turn updatedTour_Turn = tour_turnService.updateTour_Turn(maTour, turn, tour_turn);
        if (updatedTour_Turn != null) {
            return new ResponseEntity<>(updatedTour_Turn, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maTour}/{turn}")
    public ResponseEntity<Void> deleteTour_Turn(@PathVariable int maTour, @PathVariable int turn) {
        tour_turnService.deleteTour_Turn(maTour, turn);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}