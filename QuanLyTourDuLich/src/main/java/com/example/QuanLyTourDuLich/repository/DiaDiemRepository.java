package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.DiaDiem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaDiemRepository extends JpaRepository<DiaDiem, Integer> {

}
