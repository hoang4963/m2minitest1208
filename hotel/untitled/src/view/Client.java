package view;

import controller.HotelManager;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();
        int input;
        do {
            System.out.println("Nhap -1 de thoat");
            System.out.println("1. Them phong");
            System.out.println("2. Them nguoi checkin");
            System.out.println("3. Check out");
            System.out.println("4. Tim nguoi");
            System.out.println("5. Phong da thue");
            System.out.println("6. Nguoi da thue");
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
            case 5 -> showinfoRoom();
            case 6 -> showinfoNguoi();
            case -1 -> System.out.println("out");
            default -> System.out.println("nhap lai ");
        }
    }

    private static void showinfoNguoi() {
    }

    private static void showinfoRoom() {
    }

    private static void findNguoi() {
    }

    private static void addPhong() {
    }

    private static void nguoiCheckOut() {

    }

    private static void addNguoiCheckIn() {

    }
}

