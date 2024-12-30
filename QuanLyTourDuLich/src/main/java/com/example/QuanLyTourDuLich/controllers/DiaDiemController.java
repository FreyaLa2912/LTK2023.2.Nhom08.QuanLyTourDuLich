package com.example.QuanLyTourDuLich.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.QuanLyTourDuLich.entity.DiaDiem;
import com.example.QuanLyTourDuLich.service.DiaDiemService;
import com.example.QuanLyTourDuLich.exception.ResourceNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/diadiem")
public class DiaDiemController {

    @Autowired
    private DiaDiemService diaDiemService;

    @GetMapping
    public List<DiaDiem> getAllDiaDiem() {
        return diaDiemService.findAll();
    }

    @GetMapping("/{id}")
    public DiaDiem getDiaDiemById(@PathVariable int id) {
        return diaDiemService.findById(id);
    }

    @PostMapping
    public DiaDiem createDiaDiem(@RequestBody DiaDiem diaDiem) {
        return diaDiemService.save(diaDiem);
    }

    @PutMapping("/{id}")
    public DiaDiem updateDiaDiem(@PathVariable int id, @RequestBody DiaDiem diaDiemDetails) {
        DiaDiem diaDiem = diaDiemService.findById(id);
        if (diaDiem == null) {
            throw new ResourceNotFoundException("DiaDiem not found with id " + id);
        }

        diaDiem.setTenDiaDiem(diaDiemDetails.getTenDiaDiem());
        diaDiem.setMoTa(diaDiemDetails.getMoTa());
        diaDiem.setToaDo(diaDiemDetails.getToaDo());
        diaDiem.setHinhAnh(diaDiemDetails.getHinhAnh());
        diaDiem.setThanhPho(diaDiemDetails.getThanhPho());
        diaDiem.setTinh(diaDiemDetails.getTinh());

        return diaDiemService.save(diaDiem);
    }

    @DeleteMapping("/{id}")
    public void deleteDiaDiem(@PathVariable int id) {
        diaDiemService.deleteById(id);
    }
}
