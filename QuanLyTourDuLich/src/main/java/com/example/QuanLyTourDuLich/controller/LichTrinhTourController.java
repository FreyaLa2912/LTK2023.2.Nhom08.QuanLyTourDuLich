package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.LichTrinhTour;
import com.example.QuanLyTourDuLich.service.LichTrinhTourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lichtrinhtours")
public class LichTrinhTourController {

    @Autowired
    private LichTrinhTourService lichTrinhTourService;

    @GetMapping
    public ResponseEntity<List<LichTrinhTour>> getAllLichTrinhTours() {
        List<LichTrinhTour> lichTrinhTours = lichTrinhTourService.getAllLichTrinhTours();
        return new ResponseEntity<>(lichTrinhTours, HttpStatus.OK);
    }

    @GetMapping("/{maTour}/{thuTuThamQuan}")
    public ResponseEntity<LichTrinhTour> getLichTrinhTourById(@PathVariable int maTour, @PathVariable int thuTuThamQuan) {
        LichTrinhTour lichTrinhTour = lichTrinhTourService.getLichTrinhTourById(maTour, thuTuThamQuan);
        if (lichTrinhTour != null) {
            return new ResponseEntity<>(lichTrinhTour, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<LichTrinhTour> createLichTrinhTour(@RequestBody LichTrinhTour lichTrinhTour) {
        LichTrinhTour createdLichTrinhTour = lichTrinhTourService.createLichTrinhTour(lichTrinhTour);
        return new ResponseEntity<>(createdLichTrinhTour, HttpStatus.CREATED);
    }

    @PutMapping("/{maTour}/{thuTuThamQuan}")
    public ResponseEntity<LichTrinhTour> updateLichTrinhTour(
            @PathVariable int maTour, 
            @PathVariable int thuTuThamQuan, 
            @RequestBody LichTrinhTour lichTrinhTour) {
        LichTrinhTour updatedLichTrinhTour = lichTrinhTourService.updateLichTrinhTour(maTour, thuTuThamQuan, lichTrinhTour);
        if (updatedLichTrinhTour != null) {
            return new ResponseEntity<>(updatedLichTrinhTour, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maTour}/{thuTuThamQuan}")
    public ResponseEntity<Void> deleteLichTrinhTour(@PathVariable int maTour, @PathVariable int thuTuThamQuan) {
        lichTrinhTourService.deleteLichTrinhTour(maTour, thuTuThamQuan);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}