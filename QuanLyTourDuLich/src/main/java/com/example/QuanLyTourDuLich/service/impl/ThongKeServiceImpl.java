package com.example.QuanLyTourDuLich.service.impl;

import com.example.QuanLyTourDuLich.dto.BieuDoDto;
import com.example.QuanLyTourDuLich.dto.ThongKeDto;
import com.example.QuanLyTourDuLich.repository.DatTourRepository;
import com.example.QuanLyTourDuLich.repository.DiaDiemRepository;
import com.example.QuanLyTourDuLich.repository.TourRepository;
import com.example.QuanLyTourDuLich.service.ThongKeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThongKeServiceImpl implements ThongKeService {

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private DiaDiemRepository diaDiemRepository;

    @Autowired
    private DatTourRepository datTourRepository;

    @Override
    public ThongKeDto getThongKe() {
        ThongKeDto thongKeDto = new ThongKeDto();
        thongKeDto.setTongSoTour(tourRepository.count());
        thongKeDto.setTongSoDiaDiem(diaDiemRepository.count());
        thongKeDto.setTongSoDonDatTour(datTourRepository.count()); // Thêm

        // Tính tổng doanh thu
        double tongDoanhThu = datTourRepository.findAll().stream()
                .mapToDouble(datTour -> datTour.getTongTien().doubleValue()) // Chuyển đổi BigDecimal sang double
                .sum();
        thongKeDto.setTongDoanhThu(tongDoanhThu);

        // Tính tỷ lệ tăng trưởng doanh thu (so với tuần trước) - ví dụ
        thongKeDto.setTyLeTangTruongDoanhThu(10.5); 

        // Tính tỷ lệ tăng trưởng lượt đặt (so với tuần trước) - ví dụ
        thongKeDto.setTyLeTangTruongLuotDat(-5.2); 

        // ... (Tính các tỷ lệ tăng trưởng khác)

        // Lấy dữ liệu cho biểu đồ doanh thu - ví dụ
        BieuDoDto bieuDoDoanhThu = new BieuDoDto();
        bieuDoDoanhThu.setLabels(new ArrayList<>(List.of("Tháng 1", "Tháng 2", "Tháng 3"))); // Sử dụng new ArrayList<>()
        bieuDoDoanhThu.setData(new ArrayList<>(List.of(1000.0, 1500.0, 2000.0))); // Sử dụng new ArrayList<>()
        thongKeDto.setBieuDoDoanhThu(bieuDoDoanhThu);

        // Lấy tỉ lệ lượt đặt tour theo trạng thái - ví dụ
        Map<String, Integer> tiLeLuotDatTheoTrangThai = new HashMap<>(); // Sử dụng new HashMap<>()
        tiLeLuotDatTheoTrangThai.put("Đã xác nhận", 60);
        tiLeLuotDatTheoTrangThai.put("Đang chờ", 30);
        tiLeLuotDatTheoTrangThai.put("Đã hủy", 10);
        thongKeDto.setTiLeLuotDatTheoTrangThai(tiLeLuotDatTheoTrangThai);

        

        // Lấy doanh thu theo tháng - ví dụ
        List<Double> doanhThuTheoThang = List.of(10000.0, 15000.0, 12000.0, 18000.0, 20000.0, 22000.0, 25000.0, 23000.0, 28000.0, 30000.0, 25000.0, 20000.0);
        thongKeDto.setDoanhThuTheoThang(doanhThuTheoThang);

        return thongKeDto;
    }
}
