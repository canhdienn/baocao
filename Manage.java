import java.util.ArrayList;
import java.util.List;

public class Manage {
    public List<quanLyNhaDat> listnNhaDats;

    public Manage() {
        listnNhaDats = new ArrayList<>();
    }

    public void addEmployee(quanLyNhaDat employee) {
        listnNhaDats.add(employee);
    }

    public quanLyNhaDat findMaxThanhTien() {
        quanLyNhaDat maxThanhTien = listnNhaDats.get(0);
        for (quanLyNhaDat quanLyNhaDat : listnNhaDats) {
            if ( quanLyNhaDat.thanhTien() > maxThanhTien.thanhTien()) {
                maxThanhTien = quanLyNhaDat;
            }
        }
        return maxThanhTien;
    }
    public void addTransaction(quanLyNhaDat transaction) {
        listnNhaDats.add(transaction);
    }

    public void printTransactions() {
        for (quanLyNhaDat transaction : listnNhaDats) {
            System.out.println(transaction.toString());
        }
    }
    // public void increaseCoefficientSalary (double increase) {
    //     for (quanLyNhaDat employee : listnNhaDats) {
    //         employee.coefficientSalary += increase;
    //     }
    //Tinh trung binh
    public double averageLandTransaction() {
        double total = 0;
        int count = 0;

        for (quanLyNhaDat transaction : listnNhaDats) {
            if (transaction instanceof quanLyDat) {
                total += transaction.thanhTien();
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }
}
