// import java.util.Scanner;
// import java.io.File;
// import java.io.FileNotFoundException;
// public class Main {
//     public static void main(String[] args) {

//         File file = new File("input.txt");
//         Scanner scanner = null;


//         try {
//             scanner = new Scanner(file);
//         } catch (FileNotFoundException e) {
//             System.out.println("File not found");
//             return;
//         }
//         Manage manage = new Manage();

//         // Tạo và thêm các giao dịch
//         String id1 = scanner.nextLine();
//         int year1 = scanner.nextInt();
//         int month1 = scanner.nextInt();
//         int day1 = scanner.nextInt();
//         double price1 = scanner.nextDouble();
//         double area1 = scanner.nextDouble();
//         String type1 = scanner.next();
//         scanner.nextLine(); // consume the leftover newline

//         quanLyDat transaction1 = new quanLyDat(id1, day1, month1, year1, price1, area1, type1);
//         manage.addTransaction(transaction1);

//         String id2 = scanner.nextLine();
//         int year2 = scanner.nextInt();
//         scanner.nextLine(); 
//         int month2 = scanner.nextInt();
//         scanner.nextLine(); 
//         int day2 = scanner.nextInt();
//         scanner.nextLine(); 
//         double price2 = scanner.nextDouble();
//         scanner.nextLine(); 
//         double area2 = scanner.nextDouble();
//         scanner.nextLine(); 
//         String type2 = scanner.nextLine();;
//         System.out.println("Enter address for quanLyNha:");
//         String address2 = scanner.nextLine();

//         quanLyNha transaction2 = new quanLyNha(id2, day2, month2, year2, price2, area2, type2, address2);
//         manage.addTransaction(transaction2);

//         //  In ra tất cả các giao dịch
//         // manage.printTransactions();

//         //  Menu //
//         System.out.println("---MENU---");
//         System.out.println("1.Xuat ra cac giao dich cua thang 9 nam 2013");
//         System.out.println("2.Cap nhat lai dien tich/don gia");
//         System.out.println("3.Tim giao dich lon nhat");
//         System.out.println("4.Sap xep thu tu theo gia tien cac loai giao dich");
//         System.out.println("5.Xem giao dich da ban hay chua");
//         System.out.println("6. Xuat ra file output");
//         System.out.println("0.Thoat");

//         int option;
//         do {
//             System.out.println("Enter option: ");
//             option = scanner.nextInt();
//         } while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 0);
            
//     }
// }

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
            System.out.println("1. Xuat ra cac giao dich cua thang 9 nam 2013");
            System.out.println("2. Cap nhat lai dien tich/don gia");
            System.out.println("3. Tim giao dich lon nhat");
            System.out.println("4. Sap xep thu tu theo gia tien cac loai giao dich");
            System.out.println("5. Xem giao dich da ban hay chua");
            System.out.println("6. Xuat ra file output");
            System.out.println("7. Tinh trung binh thanh tien giao dich dat");
            System.out.println("8. Xem tat ca cac giao dich");
            System.out.println("9. Sap xep cac giao dich theo gia tien");
            System.out.println("10. Cap nhat lai don gia cua giao dich");
            System.out.println("0. Thoat");
            System.out.println();
            System.out.println("Enter option: ");
            option = s.nextInt();
            switch (option) {
                case 1:
                    // Handle option 1
                    break;
                case 2:
                    // Handle option 2
                    break;
                case 3:
                    // Handle option 3
                    break;
                case 4:
                    // Handle option 4
                    break;
                case 5:
                    // Handle option 5
                    break;
                case 6:
                    // Handle option 6
                    break;
                case 7:
                    // Handle option 7
                    double average = manage.averageLandTransaction();
                    System.out.println("Trung binh thanh tien cua giao dich dat " + average);
                    break;
                case 8:
                    // Handle option 8
                    manage.printTransactions();
                    break;
                case 9:
                    // Handle option 9
                    manage.sortTransactionsByPrice();
                    manage.printTransactions();
                    break;
                case 10 :
                    // Handle option 10
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the transaction ID: ");
                    String transactionId = scanner.nextLine();
                    System.out.println("Enter the new price: ");
                    double newDonGia = scanner.nextDouble();
                    manage.updateDonGia(transactionId, newDonGia);
                    manage.printTransaction1(transactionId);
                    break;
                case 0:
                    // Handle option 0
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 0);
    }
}
