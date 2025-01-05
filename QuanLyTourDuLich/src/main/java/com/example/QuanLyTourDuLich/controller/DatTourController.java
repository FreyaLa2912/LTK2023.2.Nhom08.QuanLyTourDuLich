package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.DatTour;
import com.example.QuanLyTourDuLich.service.DatTourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dattours")
public class DatTourController {

    @Autowired
    private DatTourService datTourService;

    @GetMapping
    public ResponseEntity<List<DatTour>> getAllDatTours() {
        List<DatTour> datTours = datTourService.getAllDatTours();
        return new ResponseEntity<>(datTours, HttpStatus.OK);
    }

    @GetMapping("/{maDatTour}")
    public ResponseEntity<DatTour> getDatTourById(@PathVariable int maDatTour) {
        DatTour datTour = datTourService.getDatTourById(maDatTour);
        if (datTour != null) {
            return new ResponseEntity<>(datTour, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<DatTour> createDatTour(@RequestBody DatTour datTour) {
        DatTour createdDatTour = datTourService.createDatTour(datTour);
        return new ResponseEntity<>(createdDatTour, HttpStatus.CREATED);
    }

    @PutMapping("/{maDatTour}")
    public ResponseEntity<DatTour> updateDatTour(@PathVariable int maDatTour, @RequestBody DatTour datTour) {
        DatTour updatedDatTour = datTourService.updateDatTour(maDatTour, datTour);
        if (updatedDatTour != null) {
            return new ResponseEntity<>(updatedDatTour, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maDatTour}")
    public ResponseEntity<Void> deleteDatTour(@PathVariable int maDatTour) {
        datTourService.deleteDatTour(maDatTour);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}