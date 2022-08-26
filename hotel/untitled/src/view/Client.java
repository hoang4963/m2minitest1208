package view;

import controller.HotelManager;
import model.Nguoi;
import model.RoomOfHotel;

import java.time.LocalDate;
import java.util.Scanner;

public class Client {
     private static HotelManager listRoom = new HotelManager();
    public static void main(String[] args) {
        int input;
        do {
            System.out.println("Nhap -1 de thoat");
            System.out.println("1. Them phong");
            System.out.println("2. Them nguoi checkin");
            System.out.println("3. Check out");
            System.out.println("4. Tim nguoi");
            System.out.println("5. Phong");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            addDeleteFind(input);
        }
        while (input != -1);
    }

    private static void addDeleteFind(int chose){
        switch (chose) {
            case 1 -> addPhong();
            case 2 -> addNguoiCheckIn();
            case 3 -> nguoiCheckOut();
            case 4 -> findNguoi();
            case 5 -> showAllRoom();
            case -1 -> System.out.println("out");
            default -> System.out.println("nhap lai ");
        }
    }

    private static void findNguoi() {
        System.out.println("nhap so CMND");
        Scanner scanner = new Scanner(System.in);
        long cmnd = scanner.nextInt();
        for (int i = 0; i < listRoom.size() ; i++) {
            if (listRoom.getRoomOfHotel(i).getNguoi().getCmnd() == cmnd){
                System.out.println(listRoom.getRoomOfHotel(i));
            }
        }
    }

    private static void showAllRoom() {
        for (int i = 0; i < listRoom.size(); i++) {
            System.out.println(listRoom.getRoomOfHotel(i));
        }
    }
    private static void addPhong() {
        int chose;
        do {
            System.out.println("Nhap tru -1 de thoat");
            System.out.println("1. Phong co nguoi");
            System.out.println("2. Phong trong");
            System.out.println("3. Tro lai");
            Scanner scanner = new Scanner(System.in);
            chose = scanner.nextInt();
            createRoom(chose);
        }while (chose != -1);
    }

    private static void nguoiCheckOut() {

    }

    private static void addNguoiCheckIn() {

    }
    private static void createRoom(int chose){
        switch (chose){
        case 1 -> createRoomNull();
        case 2 -> createRoomHasNguoi();
        }
    }
    private static void createRoomNull(){
        System.out.println("Type of room: ");
        Scanner scanner = new Scanner(System.in);
        String typeOfRoom = scanner.nextLine();
        System.out.println("Cost: ");
        Scanner scanner1 = new Scanner(System.in);
        double cost = scanner1.nextDouble();
        RoomOfHotel room = new RoomOfHotel(typeOfRoom,cost);
        listRoom.addRoom(room);
    }
    private static void createRoomHasNguoi(){
        System.out.println("Nhap ten nguoi:");
        Scanner scanner2 = new Scanner(System.in);
        String name = scanner2.nextLine();
        System.out.println("Nhap CMND:");
        Scanner scanner3 = new Scanner(System.in);
        long cmnd = scanner3.nextLong();
        System.out.println("Sinh nhat: ");
        Scanner scanner4 = new Scanner(System.in);
        String birthday = scanner4.nextLine();
        Nguoi nguoi = new Nguoi(name,cmnd,birthday);
        System.out.println("Type of room: ");
        Scanner scanner = new Scanner(System.in);
        String typeOfRoom = scanner.nextLine();
        System.out.println("Cost: ");
        Scanner scanner1 = new Scanner(System.in);
        double cost = scanner1.nextDouble();
        System.out.println("Nhap ngay join:");
        Scanner scanner5 = new Scanner(System.in);
        int day = scanner5.nextInt();
        System.out.println("Nhap thang join:");
        Scanner scanner6 = new Scanner(System.in);
        int month = scanner6.nextInt();
        System.out.println("Nhap nam join:");
        Scanner scanner7 = new Scanner(System.in);
        int year = scanner7.nextInt();
        RoomOfHotel room = new RoomOfHotel(typeOfRoom,cost,nguoi, LocalDate.of(year,month,day));
    }
}

