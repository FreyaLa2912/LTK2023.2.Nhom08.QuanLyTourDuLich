package com.example.QuanLyTourDuLich.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import java.util.ArrayList;
// import java.util.List;

// @Controller
// public class TourController {

//     @GetMapping("/tours")
//     public String getTours(Model model) {
//         // Dữ liệu mẫu
//         List<Tour> tours = new ArrayList<>();
//         tours.add(new Tour("Tham Quan TP HCM", 500000, "2024-01-10", "2024-01-10"));
//         tours.add(new Tour("Khám Phá Miền Tây", 700000, "2024-01-15", "2024-01-15"));
        
//         model.addAttribute("tours", tours);
//         return "layout";
//     }

//     // Class mẫu (sẽ thay bằng Entity thực tế)
//     public static class Tour {
//         private String tenTour;
//         private int giaTour;
//         private String thoiGianKhoiHanh;
//         private String thoiGianKetThuc;

//         public Tour(String tenTour, int giaTour, String thoiGianKhoiHanh, String thoiGianKetThuc) {
//             this.tenTour = tenTour;
//             this.giaTour = giaTour;
//             this.thoiGianKhoiHanh = thoiGianKhoiHanh;
//             this.thoiGianKetThuc = thoiGianKetThuc;
//         }

//         public String getTenTour() {
//             return tenTour;
//         }

//         public int getGiaTour() {
//             return giaTour;
//         }

//         public String getThoiGianKhoiHanh() {
//             return thoiGianKhoiHanh;
//         }

//         public String getThoiGianKetThuc() {
//             return thoiGianKetThuc;
//         }
//     }
// }

import com.example.QuanLyTourDuLich.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TourController {
    @Autowired
    private TourService tourService;

    @GetMapping("/tours")
    public String listTours(Model model) {
        model.addAttribute("tours", tourService.getAllTours());
        return "tours";
    }
}