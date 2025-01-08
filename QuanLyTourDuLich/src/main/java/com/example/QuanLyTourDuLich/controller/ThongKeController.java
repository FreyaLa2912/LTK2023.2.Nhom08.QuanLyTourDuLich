package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.dto.ThongKeDto;
import com.example.QuanLyTourDuLich.service.ThongKeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/thongke")
public class ThongKeController {

    @Autowired
    private ThongKeService thongKeService;

    @GetMapping
    public ResponseEntity<ThongKeDto> getThongKe() {
        ThongKeDto thongKeDto = thongKeService.getThongKe();
        return new ResponseEntity<>(thongKeDto, HttpStatus.OK);
    }
}
