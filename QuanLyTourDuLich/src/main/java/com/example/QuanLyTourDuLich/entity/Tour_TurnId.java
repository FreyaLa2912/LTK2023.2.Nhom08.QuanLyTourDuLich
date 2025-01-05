package com.example.QuanLyTourDuLich.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Tour_TurnId implements Serializable {

    @Column(name = "MaTour")
    private int maTour;

    @Column(name = "Turn")
    private int turn;

    // Constructor, getter và setter, equals và hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour_TurnId that = (Tour_TurnId) o;
        return maTour == that.maTour && turn == that.turn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTour, turn);
    }

    public Tour_TurnId() {
    }

    public Tour_TurnId(int maTour, int turn) {
        this.maTour = maTour;
        this.turn = turn;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
