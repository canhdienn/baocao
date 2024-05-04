
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        File file = new File("input.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        Manage manage = new Manage();

        // Tạo và thêm các giao dịch
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

        String id2 = scanner.nextLine();
        int year2 = scanner.nextInt();
        scanner.nextLine(); 
        int month2 = scanner.nextInt();
        scanner.nextLine(); 
        int day2 = scanner.nextInt();
        scanner.nextLine(); 
        double price2 = scanner.nextDouble();
        scanner.nextLine(); 
        double area2 = scanner.nextDouble();
        scanner.nextLine(); 
        String type2 = scanner.nextLine();;
        System.out.println("Enter address for quanLyNha:");
        String address2 = scanner.nextLine();

        quanLyNha transaction2 = new quanLyNha(id2, day2, month2, year2, price2, area2, type2, address2);
        manage.addTransaction(transaction2);

        // In ra tất cả các giao dịch
        manage.printTransactions();
        
    }
}
