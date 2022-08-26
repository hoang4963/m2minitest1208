package model;

import java.time.LocalDate;

public class RoomOfHotel {
    private String typeOfRoom;
    private double cost;
    private Nguoi nguoi;
    private LocalDate dayJoin;

    public RoomOfHotel(String typeOfRoom, double cost, Nguoi nguoi, LocalDate dayJoin) {
        this.typeOfRoom = typeOfRoom;
        this.cost = cost;
        this.nguoi = nguoi;
        this.dayJoin = dayJoin;
    }

    public RoomOfHotel(String typeOfRoom, double cost) {
        this.typeOfRoom = typeOfRoom;
        this.cost = cost;
        this.dayJoin = null;
        this.nguoi = null;
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
