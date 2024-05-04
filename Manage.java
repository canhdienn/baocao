import java.util.ArrayList;
import java.util.List;

public class Manage {
    public List<quanLyNhaDat> listnNhaDats;

    public Manage() {
        listnNhaDats = new ArrayList<>();
    }

    public void addTransaction(quanLyNhaDat transaction) {
        listnNhaDats.add(transaction);
    }

    // Tìm thành tiền lớn nhất
    public quanLyNhaDat findMaxThanhTien() {
        quanLyNhaDat maxThanhTien = listnNhaDats.get(0);
        for (quanLyNhaDat quanLyNhaDat : listnNhaDats) {
            if ( quanLyNhaDat.thanhTien() > maxThanhTien.thanhTien()) {
                maxThanhTien = quanLyNhaDat;
            }
        }
        return maxThanhTien;
    }

    // In các dữ liệu ra màn hình
    public void printTransactions() {
        for (quanLyNhaDat transaction : listnNhaDats) {
            System.out.println(transaction.toString());
            // System.out.println(transaction.dienTich);
        }
    }

}
