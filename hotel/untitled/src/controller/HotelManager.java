package controller;
import model.Nguoi;
import model.RoomOfHotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class HotelManager implements Serializable {
    List<RoomOfHotel> listRoom;
    public HotelManager() {
        listRoom = new ArrayList<>();
        WriteAndReadData.writeToDataHotel((HotelManager) listRoom);
        listRoom = (List<RoomOfHotel>) WriteAndReadData.readDataHotel();
    }
    public double calculateMoney(int index){
        LocalDate now = LocalDate.now();
        LocalDate dayJoin = listRoom.get(index).getDayJoin();
        if (dayJoin != null&& (index > 0 || index < listRoom.size())) {
          return listRoom.get(index).getCost() * (CalculateDate.calculateDays(now.getDayOfMonth(), now.getMonthValue(), now.getYear()) - CalculateDate.calculateDays(dayJoin.getDayOfMonth(), dayJoin.getMonthValue(), dayJoin.getYear()));
        }
        else return 0;
    }
    public int size(){
        return listRoom.size();
    }
    public void addNguoi(RoomOfHotel room, Nguoi nguoi){
        room.setNguoi(nguoi);
        listRoom.add(room);
        WriteAndReadData.writeToDataHotel((HotelManager) listRoom);
    }
    public void nguoiCheckOut(long cmnd){
        int indexRoomCheckOut = 0;
        for (int i = 0; i < listRoom.size(); i++) {
            if (listRoom.get(i).getNguoi().getCmnd() == cmnd){
                indexRoomCheckOut = i;
            }
        }
        listRoom.remove(indexRoomCheckOut);
        WriteAndReadData.writeToDataHotel((HotelManager) listRoom);
    }
    public void showRoomCheckIn(){
        for (RoomOfHotel room : listRoom) {
            System.out.println(room);
        }
    }
    public void showNguoiCheckIn(){
        for (RoomOfHotel room : listRoom) {
            System.out.println(room.getNguoi());
        }
    }
    public RoomOfHotel getRoomOfHotel(int index){
        return listRoom.get(index);
    }
    public void addRoom(RoomOfHotel room){
        listRoom.add(room);
    }
}
