package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.HuongDanVien;
import com.example.QuanLyTourDuLich.service.HuongDanVienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/huongdanviens")
public class HuongDanVienController {

    @Autowired
    private HuongDanVienService huongDanVienService;

    @GetMapping
    public ResponseEntity<List<HuongDanVien>> getAllHuongDanViens() {
        List<HuongDanVien> huongDanViens = huongDanVienService.getAllHuongDanViens();
        return new ResponseEntity<>(huongDanViens, HttpStatus.OK);
    }

    @GetMapping("/{maHDV}")
    public ResponseEntity<HuongDanVien> getHuongDanVienById(@PathVariable int maHDV) {
        HuongDanVien huongDanVien = huongDanVienService.getHuongDanVienById(maHDV);
        if (huongDanVien != null) {
            return new ResponseEntity<>(huongDanVien, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<HuongDanVien> createHuongDanVien(@RequestBody HuongDanVien huongDanVien) {
        HuongDanVien createdHuongDanVien = huongDanVienService.createHuongDanVien(huongDanVien);
        return new ResponseEntity<>(createdHuongDanVien, HttpStatus.CREATED);
    }

    @PutMapping("/{maHDV}")
    public ResponseEntity<HuongDanVien> updateHuongDanVien(@PathVariable int maHDV, @RequestBody HuongDanVien huongDanVien) {
        HuongDanVien updatedHuongDanVien = huongDanVienService.updateHuongDanVien(maHDV, huongDanVien);
        if (updatedHuongDanVien != null) {
            return new ResponseEntity<>(updatedHuongDanVien, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maHDV}")
    public ResponseEntity<Void> deleteHuongDanVien(@PathVariable int maHDV) {
        huongDanVienService.deleteHuongDanVien(maHDV);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}