package com.example.QuanLyTourDuLich.controller;

import com.example.QuanLyTourDuLich.dto.DatTourRequest;
import com.example.QuanLyTourDuLich.entity.DatTour;
import com.example.QuanLyTourDuLich.entity.Tour_Turn;
import com.example.QuanLyTourDuLich.service.DatTourService;
import com.example.QuanLyTourDuLich.service.NguoiDungService;
import com.example.QuanLyTourDuLich.service.Tour_TurnService;
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

    @Autowired
    private Tour_TurnService tour_turnService; // Inject Tour_TurnService

    @Autowired
    private NguoiDungService nguoiDungService; // Inject NguoiDungService

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
    public ResponseEntity<DatTour> createDatTour(@RequestBody DatTourRequest datTourRequest) {
        try {
            // Kiểm tra xem Người Dùng có tồn tại không
            if (datTourRequest.getMaNguoiDung() == 0) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST); 
            }

            // Kiểm tra xem Tour_Turn có tồn tại không
            if (datTourRequest.getMaTour() == 0 || datTourRequest.getTurn() == 0) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            // Lấy Tour_Turn từ database
            Tour_Turn tour_turn = tour_turnService.getTour_TurnById(datTourRequest.getMaTour(), datTourRequest.getTurn());
            if (tour_turn == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            // Tạo DatTour mới
            DatTour datTour = new DatTour();
            datTour.setNguoiDung(nguoiDungService.getNguoiDungById(datTourRequest.getMaNguoiDung()));
            datTour.setTour_turn(tour_turn);
            datTour.setNgayDat(datTourRequest.getNgayDat());
            datTour.setSoLuongKhach(datTourRequest.getSoLuongKhach());
            datTour.setTongTien(datTourRequest.getTongTien());

            DatTour createdDatTour = datTourService.createDatTour(datTour);
            return new ResponseEntity<>(createdDatTour, HttpStatus.CREATED);

        } catch (Exception e) {
            // Xử lý exception chi tiết hơn (ví dụ: log lỗi, trả về thông báo lỗi cụ thể)
            e.printStackTrace(); // In ra stack trace để debug
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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

    @PutMapping("/{maDatTour}/confirm")
    public ResponseEntity<DatTour> confirmDatTour(@PathVariable int maDatTour) {
        DatTour datTour = datTourService.getDatTourById(maDatTour);
        if (datTour != null) {
            datTour.setTrangThai("Đã xác nhận"); // Cập nhật trạng thái
            datTour = datTourService.updateDatTour(maDatTour, datTour); // Lưu thay đổi vào database
            return new ResponseEntity<>(datTour, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{maDatTour}/cancel")
    public ResponseEntity<DatTour> cancelDatTour(@PathVariable int maDatTour) {
        DatTour datTour = datTourService.getDatTourById(maDatTour);
        if (datTour != null) {
            datTour.setTrangThai("Đã hủy"); // Cập nhật trạng thái
            datTour = datTourService.updateDatTour(maDatTour, datTour); // Lưu thay đổi vào database
            return new ResponseEntity<>(datTour, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // API lấy danh sách turn của tour
    @GetMapping("/{maTour}/turns")
    public ResponseEntity<List<Integer>> getTurnsByMaTour(@PathVariable int maTour) {
        // Lấy danh sách turn từ Tour_TurnService 
        List<Integer> turns = tour_turnService.getTurnsByMaTour(maTour);
        return new ResponseEntity<>(turns, HttpStatus.OK);
    }
}