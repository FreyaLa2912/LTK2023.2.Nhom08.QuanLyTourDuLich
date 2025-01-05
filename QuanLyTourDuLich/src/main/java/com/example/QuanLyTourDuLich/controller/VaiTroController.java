package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.entity.VaiTro;
import com.example.QuanLyTourDuLich.service.VaiTroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vaitros")
public class VaiTroController {

    @Autowired
    private VaiTroService vaiTroService;

    @GetMapping
    public ResponseEntity<List<VaiTro>> getAllVaiTros() {
        List<VaiTro> vaiTros = vaiTroService.getAllVaiTros();
        return new ResponseEntity<>(vaiTros, HttpStatus.OK);
    }

    @GetMapping("/{maVaiTro}")
    public ResponseEntity<VaiTro> getVaiTroById(@PathVariable int maVaiTro) {
        VaiTro vaiTro = vaiTroService.getVaiTroById(maVaiTro);
        if (vaiTro != null) {
            return new ResponseEntity<>(vaiTro, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<VaiTro> createVaiTro(@RequestBody VaiTro vaiTro) {
        VaiTro createdVaiTro = vaiTroService.createVaiTro(vaiTro);
        return new ResponseEntity<>(createdVaiTro, HttpStatus.CREATED);
    }

    @PutMapping("/{maVaiTro}")
    public ResponseEntity<VaiTro> updateVaiTro(@PathVariable int maVaiTro, @RequestBody VaiTro vaiTro) {
        VaiTro updatedVaiTro = vaiTroService.updateVaiTro(maVaiTro, vaiTro);
        if (updatedVaiTro != null) {
            return new ResponseEntity<>(updatedVaiTro, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{maVaiTro}")
    public ResponseEntity<Void> deleteVaiTro(@PathVariable int maVaiTro) {
        vaiTroService.deleteVaiTro(maVaiTro);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}