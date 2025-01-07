package com.example.QuanLyTourDuLich.repository;

import com.example.QuanLyTourDuLich.entity.Tour_Turn;
import com.example.QuanLyTourDuLich.entity.Tour_TurnId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Tour_TurnRepository extends JpaRepository<Tour_Turn, Tour_TurnId> { 

    @Query("SELECT tt.id.turn FROM Tour_Turn tt WHERE tt.id.maTour = :maTour")
    List<Integer> findTurnsByMaTour(@Param("maTour") int maTour);
}