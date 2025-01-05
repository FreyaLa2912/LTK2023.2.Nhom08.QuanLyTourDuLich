package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.KhachHang;
import com.example.QuanLyTourDuLich.service.KhachHangService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khachhangs")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping
    public ResponseEntity<List<KhachHang>> getAllKhachHangs() {
        List<KhachHang> khachHangs = khachHangService.getAllKhachHangs();
        return new ResponseEntity<>(khachHangs, HttpStatus.OK);
    }

    @GetMapping("/{maKH}")
    public ResponseEntity<KhachHang> getKhachHangById(@PathVariable int maKH) {
        KhachHang khachHang = khachHangService.getKhachHangById(maKH);
        if (khachHang != null) {
            return new ResponseEntity<>(khachHang, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<KhachHang> createKhachHang(@RequestBody KhachHang khachHang) {
        KhachHang createdKhachHang = khachHangService.createKhachHang(khachHang);
        return new ResponseEntity<>(createdKhachHang, HttpStatus.CREATED);
    }

    @PutMapping("/{maKH}")
    public ResponseEntity<KhachHang> updateKhachHang(@PathVariable int maKH, @RequestBody KhachHang khachHang) {
        KhachHang updatedKhachHang = khachHangService.updateKhachHang(maKH, khachHang);
        if (updatedKhachHang != null) {
            return new ResponseEntity<>(updatedKhachHang, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maKH}")
    public ResponseEntity<Void> deleteKhachHang(@PathVariable int maKH) {
        khachHangService.deleteKhachHang(maKH);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}