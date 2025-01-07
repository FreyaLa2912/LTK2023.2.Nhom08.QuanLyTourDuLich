package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.NguoiDung;
import com.example.QuanLyTourDuLich.repository.NguoiDungRepository;
import com.example.QuanLyTourDuLich.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nguoidungs")
public class NguoiDungController {

    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private NguoiDungRepository nguoiDungRepository; // Inject NguoiDungRepository

    @GetMapping
    public ResponseEntity<List<NguoiDung>> getAllNguoiDungs() {
        List<NguoiDung> nguoiDungs = nguoiDungService.getAllNguoiDungs();
        return new ResponseEntity<>(nguoiDungs, HttpStatus.OK);
    }

    @GetMapping("/{maNguoiDung}")
    public ResponseEntity<NguoiDung> getNguoiDungById(@PathVariable int maNguoiDung) {
        NguoiDung nguoiDung = nguoiDungService.getNguoiDungById(maNguoiDung);
        if (nguoiDung != null) {
            return new ResponseEntity<>(nguoiDung, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<NguoiDung> createNguoiDung(@RequestBody NguoiDung nguoiDung) {
        NguoiDung createdNguoiDung = nguoiDungService.createNguoiDung(nguoiDung);
        return new ResponseEntity<>(createdNguoiDung, HttpStatus.CREATED);
    }

    @PutMapping("/{maNguoiDung}")
    public ResponseEntity<NguoiDung> updateNguoiDung(@PathVariable int maNguoiDung, @RequestBody NguoiDung nguoiDung) {
        NguoiDung updatedNguoiDung = nguoiDungService.updateNguoiDung(maNguoiDung, nguoiDung);
        if (updatedNguoiDung != null) {
            return new ResponseEntity<>(updatedNguoiDung, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maNguoiDung}")
    public ResponseEntity<Void> deleteNguoiDung(@PathVariable int maNguoiDung) {
        nguoiDungService.deleteNguoiDung(maNguoiDung);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/login")
    public ResponseEntity<NguoiDung> login(@RequestBody NguoiDung nguoiDung) {
        // Kiểm tra tên đăng nhập và mật khẩu
        NguoiDung existingNguoiDung = nguoiDungRepository.findByTenDangNhap(nguoiDung.getTenDangNhap());
        if (existingNguoiDung != null && existingNguoiDung.getMatKhau().equals(nguoiDung.getMatKhau())) {
            return new ResponseEntity<>(existingNguoiDung, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}