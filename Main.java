import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File file = new File("quanlydat.txt");
        File file2 = new File("quanlynha.txt");
        Manage manage = new Manage();

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()){
                // Read and add land transaction
                String id1 = scanner.nextLine();
                int year1 = scanner.nextInt();
                int month1 = scanner.nextInt();
                int day1 = scanner.nextInt();
                double price1 = scanner.nextDouble();
                double area1 = scanner.nextDouble();
                String type1 = scanner.next();
                scanner.nextLine(); // consume the leftover newline
                quanLyDat transaction1 = new quanLyDat(id1, day1, month1, year1, price1, area1, type1);
                manage.addTransaction(transaction1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        try (Scanner scanner2 = new Scanner(file2)) {
            while(scanner2.hasNextLine()){
                // Read and add house transaction
                String id2 = scanner2.nextLine();
                int year2 = scanner2.nextInt();
                int month2 = scanner2.nextInt();
                int day2 = scanner2.nextInt();
                double price2 = scanner2.nextDouble();
                double area2 = scanner2.nextDouble();
                String type2 = scanner2.next();
                scanner2.nextLine(); // consume the leftover newline
                String address2 = scanner2.nextLine();
                quanLyNha transaction2 = new quanLyNha(id2, day2, month2, year2, price2, area2, type2, address2);
                manage.addTransaction(transaction2);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        // Display menu and handle user input
        displayMenu(manage);
    }

    private static void displayMenu(Manage manage) {
        Scanner s = new Scanner(System.in);
        int option;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Xuat ra cac giao dich theo thang va nam");
            System.out.println("2. Cap nhat lai don gia");
            System.out.println("3. Tim giao dich co thanh tien lon nhat");
            System.out.println("4. Sap xep cac giao dich theo don gia");
            System.out.println("5. Tong so luong giao dich tung loai");
            System.out.println("6. Ban giao dich");
            System.out.println("7. Tinh trung binh thanh tien giao dich dat");
            System.out.println("8. Xem tat ca cac giao dich");
            System.out.println("0. Thoat");
            System.out.println();
            System.out.println("Enter option: ");
            option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Input month: ");
                    int day = s.nextInt();
                    System.out.print("Input year: ");
                    int year = s.nextInt();
                    manage.printTransactionsByDate(day, year);
                    break;
                case 2:
                    System.out.print("Enter the transaction ID: ");
                    String transactionId = s.next();
                    System.out.print("Enter the new price: ");
                    double newDonGia = s.nextDouble();
                    manage.updateDonGia(transactionId, newDonGia);
                    manage.print1Transaction(transactionId);
                    break;
                case 3:
                    quanLyNhaDat maxTienDat = manage.findMaxThanhTienDat();
                    quanLyNhaDat maxTienNha = manage.findMaxThanhTienNha();
                    System.out.println("Giao dich Dat cao nhat: "+ maxTienDat.toString());
                    System.out.println("Giao dich Nha cao nhat: "+ maxTienNha.toString());
                    break;
                case 4:
                    manage.sortTransactionsByPrice();
                    manage.printTransactions();
                    break;
                case 5:
                    System.out.println("So luong GD DAT: " + manage.findSoLuongDat());
                    System.out.println("So luong GD NHA: " + manage.findSoLuongNha());
                    break;
                case 6:
                    System.out.print("Enter the transaction ID: ");
                    String transactionId2 = s.next();
                    System.out.print("Enter sold price: ");
                    double soldPrice = s.nextDouble();
                    manage.updateDaBan(transactionId2, true, soldPrice);
                    manage.print1Transaction(transactionId2);
                    break;
                case 7:
                    double average = manage.averageLandTransaction();
                    System.out.println("Trung binh thanh tien cua giao dich dat " + average);
                    break;
                case 8:
                    manage.printTransactions();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option, please choose again");
            }
        } while (option != 0);
        s.close();
    }
}