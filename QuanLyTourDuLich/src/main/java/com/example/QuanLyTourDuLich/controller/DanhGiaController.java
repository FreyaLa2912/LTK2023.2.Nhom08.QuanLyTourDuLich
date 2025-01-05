package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.DanhGia;
import com.example.QuanLyTourDuLich.service.DanhGiaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/danhgias")
public class DanhGiaController {

    @Autowired
    private DanhGiaService danhGiaService;

    @GetMapping
    public ResponseEntity<List<DanhGia>> getAllDanhGias() {
        List<DanhGia> danhGias = danhGiaService.getAllDanhGias();
        return new ResponseEntity<>(danhGias, HttpStatus.OK);
    }

    @GetMapping("/{maKH}/{maDatTour}")
    public ResponseEntity<DanhGia> getDanhGiaById(@PathVariable int maKH, @PathVariable int maDatTour) {
        DanhGia danhGia = danhGiaService.getDanhGiaById(maKH, maDatTour);
        if (danhGia != null) {
            return new ResponseEntity<>(danhGia, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<DanhGia> createDanhGia(@RequestBody DanhGia danhGia) {
        DanhGia createdDanhGia = danhGiaService.createDanhGia(danhGia);
        return new ResponseEntity<>(createdDanhGia, HttpStatus.CREATED);
    }

    @PutMapping("/{maKH}/{maDatTour}")
    public ResponseEntity<DanhGia> updateDanhGia(
            @PathVariable int maKH, 
            @PathVariable int maDatTour, 
            @RequestBody DanhGia danhGia) {
        DanhGia updatedDanhGia = danhGiaService.updateDanhGia(maKH, maDatTour, danhGia);
        if (updatedDanhGia != null) {
            return new ResponseEntity<>(updatedDanhGia, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maKH}/{maDatTour}")
    public ResponseEntity<Void> deleteDanhGia(@PathVariable int maKH, @PathVariable int maDatTour) {
        danhGiaService.deleteDanhGia(maKH, maDatTour);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}