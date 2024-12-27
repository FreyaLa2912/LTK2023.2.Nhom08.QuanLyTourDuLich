package com.example.QuanLyTourDuLich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBHelper implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        checkDatabaseConnection();
    }

    public void checkDatabaseConnection() {
        try {
            String sql = "SELECT 1";
            jdbcTemplate.execute(sql);
            System.out.println("Kết nối cơ sở dữ liệu thành công!");
        } catch (Exception e) {
            System.err.println("Kết nối cơ sở dữ liệu thất bại: " + e.getMessage());
        }
    }
}