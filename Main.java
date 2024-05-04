
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Manage manage = new Manage();

        // Tạo và thêm các giao dịch
        System.out.println("Enter id for quanLyDat:");
        String id1 = scanner.nextLine();
        System.out.println("Enter year for quanLyDat:");
        int year1 = scanner.nextInt();
        System.out.println("Enter month for quanLyDat:");
        int month1 = scanner.nextInt();
        System.out.println("Enter day for quanLyDat:");
        int day1 = scanner.nextInt();
        System.out.println("Enter price for quanLyDat:");
        double price1 = scanner.nextDouble();
        System.out.println("Enter area for quanLyDat:");
        double area1 = scanner.nextDouble();
        System.out.println("Enter type for quanLyDat:");
        String type1 = scanner.next();
        scanner.nextLine();

        quanLyDat transaction1 = new quanLyDat(id1, day1, month1, year1, price1, area1, type1);
        manage.addTransaction(transaction1);

        System.out.println("Enter id for quanLyNha:");
        String id2 = scanner.nextLine();
        System.out.println("Enter year for quanLyNha:");
        int year2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter month for quanLyNha:");
        int month2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter day for quanLyNha:");
        int day2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter price for quanLyNha:");
        double price2 = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Enter area for quanLyNha:");
        double area2 = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Enter type for quanLyNha:");
        String type2 = scanner.nextLine();
        System.out.println("Enter address for quanLyNha:");
        String address2 = scanner.nextLine();

        quanLyNha transaction2 = new quanLyNha(id2, day2, month2, year2, price2, area2, type2, address2);
        manage.addTransaction(transaction2);

        // In ra tất cả các giao dịch
        manage.printTransactions();
        
    }
}
