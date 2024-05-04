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
    // }
}
