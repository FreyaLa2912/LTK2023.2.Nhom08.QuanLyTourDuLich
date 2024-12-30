package com.example.QuanLyTourDuLich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginPage(){
        return "auth-login";
    }

    @RequestMapping("/home")
    public String loginSubmit(){
        return "/pages/landing_page";
    }
        @RequestMapping("/tour")
        public String tour() {
            return "/pages/tour"; 
    }
    @RequestMapping("/booking")
    public String booking() {
        return "/pages/booking"; 
    }
        @RequestMapping("/khachhang")
        public String khachhang() {
            return "/pages/khachhang"; 
    }
    @RequestMapping("/nhanvien")
    public String nhanvien() {
        return "/pages/nhanvien"; 
    }
    @RequestMapping("/diadiem")
    public String diadiem() {
        return "/pages/diadiem"; 
    }
}
