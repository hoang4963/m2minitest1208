package client;

import manager.MaterialManager;
import material.CrispyFlour;
import material.Material;
import material.Meat;
import java.time.LocalDate;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        CrispyFlour botMi = new CrispyFlour("1", "Bot mi", LocalDate.of(2022, 7, 8), 10000, 5);
        CrispyFlour botGao = new CrispyFlour("2", "Bot gao", LocalDate.of(2021, 12, 21), 10000, 4);
        CrispyFlour botTom = new CrispyFlour("3", "Bot tom", LocalDate.of(2021, 4, 7), 10000, 3);
        CrispyFlour botNgo = new CrispyFlour("4", "Bot ngo", LocalDate.of(2020, 7, 7), 10000, 7);
        CrispyFlour botSan = new CrispyFlour("5", "Bot san", LocalDate.of(2022, 1, 15), 10000, 4);
        Meat thiGa = new Meat("6", "Thi ga", LocalDate.of(2022, 8, 15), 70000, 2);
        Meat thiLon = new Meat("7", "Thi lon", LocalDate.of(2022, 7, 14), 100000, 5);
        Meat thiVit = new Meat("8", "Thi vit", LocalDate.of(2022, 8, 12), 60000, 1);
        Meat thiCa = new Meat("9", "Thi ca", LocalDate.of(2022, 8, 16), 80000, 3);
        Meat thiBo = new Meat("10", "Thi bo", LocalDate.of(2022, 7, 17), 120000, 4);
        MaterialManager<Material> materialManager = new MaterialManager<>();
        materialManager.add(botMi);
        materialManager.add(botGao);
        materialManager.add(botTom);
        materialManager.add(botNgo);
        materialManager.add(botSan);
        materialManager.add(thiGa);
        materialManager.add(thiLon);
        materialManager.add(thiVit);
        materialManager.add(thiCa);
        materialManager.add(thiBo);
        int choice;
        interactWithUsers(materialManager);

//        lam tuong tac voi nguoi dung

//    }
    }

    private static void interactWithUsers(MaterialManager<Material> materialManager) {
        int choice;
        do {
            System.out.println("nhap -1 de thoat");
            System.out.println("1. Them bot moi");
            System.out.println("2. Them thit moi");
            System.out.println("3. Tinh tien chenh lech discount trong ngay");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            takeChoice(materialManager, choice);
        } while (choice != -1);
    }

    private static void takeChoice(MaterialManager<Material> materialManager, int choice) {
        switch (choice) {
            case -1:
                System.out.println("ket thuc");
                break;
            case 1:
                addCrispyFlour(materialManager);
                break;
            case 2:
                addMeat(materialManager);
                break;
            case 3:
                moneydifference(materialManager);
                break;
            default:
                System.out.println("nhap 1 hoac 2 hoac 3");
        }
    }

    public static void moneydifference(MaterialManager materialManager){
        System.out.println("Chenh lech tien thuc te trong ngay la: ");
        System.out.println(MaterialManager.moneyDayDifference(materialManager));
    }
    public static void addMeat(MaterialManager materialManager){
        System.out.println("Nhap ID:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        System.out.println("Nhap nam san xuat:");
        int year = scanner.nextInt();
        System.out.println("Nhap thang san xuat:");
        int month = scanner.nextInt();
        System.out.println("Nhap ngay san xuat:");
        int day = scanner.nextInt();
        System.out.println("Nhap gia tien:");
        int cost = scanner.nextInt();
        System.out.println("Nhap khoi luong:");
        double weight = scanner.nextDouble();
        Meat meat = new Meat(id,name,LocalDate.of(year,month,day),cost,weight);
        materialManager.add(meat);
    }
    public static void addCrispyFlour(MaterialManager materialManager){
        System.out.println("Nhap ID:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        System.out.println("Nhap nam san xuat:");
        int year = scanner.nextInt();
        System.out.println("Nhap thang san xuat:");
        int month = scanner.nextInt();
        System.out.println("Nhap ngay san xuat:");
        int day = scanner.nextInt();
        System.out.println("Nhap gia tien:");
        int cost = scanner.nextInt();
        System.out.println("Nhap so luong:");
        int quantity = scanner.nextInt();
        CrispyFlour crispyFlour = new CrispyFlour(id,name,LocalDate.of(year,month,day),cost,quantity);
        materialManager.add(crispyFlour);
    }
}
