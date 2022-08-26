package controller;
import model.Nguoi;
import model.RoomOfHotel;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class HotelManager {
    List<RoomOfHotel> listRoom;

    public HotelManager() {
        listRoom = new ArrayList<>();
    }
    public double calculateMoney(int index){
        LocalDate now = LocalDate.now();
        LocalDate dayJoin = listRoom.get(index).getDayJoin();
        if (dayJoin != null&& (index > 0 || index < listRoom.size())) {
          return listRoom.get(index).getCost() * (CalculateDate.calculateDays(now.getDayOfMonth(), now.getMonthValue(), now.getYear()) - CalculateDate.calculateDays(dayJoin.getDayOfMonth(), dayJoin.getMonthValue(), dayJoin.getYear()));
        }
        else return 0;
    }
    public int roomWasRented(){
        return listRoom.size();
    }
    public void addNguoi(RoomOfHotel room, Nguoi nguoi){
        room.setNguoi(nguoi);
        listRoom.add(room);
    }
    public void nguoiCheckOut(long cmnd){
        int indexRoomCheckOut = 0;
        for (int i = 0; i < listRoom.size(); i++) {
            if (listRoom.get(i).getNguoi().getCmnd() == cmnd){
                indexRoomCheckOut = i;
            }
        }
        listRoom.remove(indexRoomCheckOut);
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
}
