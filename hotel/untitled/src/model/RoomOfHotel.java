package model;

import java.io.Serializable;
import java.time.LocalDate;

public class RoomOfHotel implements Serializable {
    private String typeOfRoom;
    private double cost;
    private Nguoi nguoi;
    private LocalDate dayJoin;
    private boolean isNull;

    public RoomOfHotel(String typeOfRoom, double cost, Nguoi nguoi, LocalDate dayJoin) {
        this.typeOfRoom = typeOfRoom;
        this.cost = cost;
        this.nguoi = nguoi;
        this.dayJoin = dayJoin;
        this.isNull = false;
    }

    public RoomOfHotel(String typeOfRoom, double cost) {
        this.typeOfRoom = typeOfRoom;
        this.cost = cost;
        this.dayJoin = null;
        this.nguoi = null;
        this.isNull = true;
    }

    public boolean isNull() {
        return isNull;
    }

    private void setIsNull(){
        if (this.nguoi != null){
            isNull = false;
        }
        else isNull = true;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    public LocalDate getDayJoin() {
        return dayJoin;
    }

    public void setDayJoin(LocalDate dayJoin) {
        this.dayJoin = dayJoin;
    }

    @Override
    public String toString() {
        return "RoomOfHotel{" +
                "typeOfRoom='" + typeOfRoom + '\'' +
                ", cost=" + cost +
                ", nguoi=" + nguoi +
                ", dayJoin=" + dayJoin +
                '}';
    }
}
