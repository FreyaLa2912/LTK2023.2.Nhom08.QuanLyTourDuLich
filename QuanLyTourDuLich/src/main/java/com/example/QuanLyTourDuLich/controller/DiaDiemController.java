package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.DiaDiem;
import com.example.QuanLyTourDuLich.service.DiaDiemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/diadiems")
public class DiaDiemController {

    @Autowired
    private DiaDiemService diaDiemService;

    @GetMapping
    public ResponseEntity<List<DiaDiem>> getAllDiaDiems() {
        List<DiaDiem> diaDiems = diaDiemService.getAllDiaDiems();
        return new ResponseEntity<>(diaDiems, HttpStatus.OK);
    }

    @GetMapping("/{maDiaDiem}")
    public ResponseEntity<DiaDiem> getDiaDiemById(@PathVariable int maDiaDiem) {
        DiaDiem diaDiem = diaDiemService.getDiaDiemById(maDiaDiem);
        if (diaDiem != null) {
            return new ResponseEntity<>(diaDiem, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<DiaDiem> createDiaDiem(@RequestBody DiaDiem diaDiem) {
        DiaDiem createdDiaDiem = diaDiemService.createDiaDiem(diaDiem);
        return new ResponseEntity<>(createdDiaDiem, HttpStatus.CREATED);
    }

    @PutMapping("/{maDiaDiem}")
    public ResponseEntity<DiaDiem> updateDiaDiem(@PathVariable int maDiaDiem, @RequestBody DiaDiem diaDiem) {
        DiaDiem updatedDiaDiem = diaDiemService.updateDiaDiem(maDiaDiem, diaDiem);
        if (updatedDiaDiem != null) {
            return new ResponseEntity<>(updatedDiaDiem, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maDiaDiem}")
    public ResponseEntity<Void> deleteDiaDiem(@PathVariable int maDiaDiem) {
        diaDiemService.deleteDiaDiem(maDiaDiem);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
