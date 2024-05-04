import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manage {
    private double donGia;
    public List<quanLyNhaDat> listnNhaDats;

    public Manage() {
        listnNhaDats = new ArrayList<>();
    }

    ///////////////// Them giao dich
    public void addTransaction(quanLyNhaDat transaction) {
        listnNhaDats.add(transaction);
    }

    ///////////// In cac giao dich ra
    public void printTransactions() {
        for (quanLyNhaDat transaction : listnNhaDats) {
            System.out.println(transaction.toString());
        }
    }

    /////////// Tim giao dich co gia tien cao nhat tung loai
    public quanLyNhaDat findMaxThanhTienDat() {
        quanLyNhaDat maxThanhTien = listnNhaDats.get(0);
        for (quanLyNhaDat transaction : listnNhaDats) {
            if (transaction instanceof quanLyDat) {
                if ( transaction.thanhTien() > maxThanhTien.thanhTien()) {
                    maxThanhTien = transaction;
                }
            }
          
        }
        return maxThanhTien instanceof quanLyDat ? maxThanhTien : null;
    }

    public quanLyNhaDat findMaxThanhTienNha() {
        quanLyNhaDat maxThanhTien = listnNhaDats.get(0);
        for (quanLyNhaDat transaction : listnNhaDats) {
            if (transaction instanceof quanLyNha) {
                if ( transaction.thanhTien() > maxThanhTien.thanhTien()) {
                    maxThanhTien = transaction;
                }
            }
          
        }
        return maxThanhTien instanceof quanLyNha ? maxThanhTien : null;
    }

    ///////// Tinh trung binh
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

    public double getDonGia() {
        return this.donGia;
    }
    public void sortTransactionsByPrice() {
        Collections.sort(listnNhaDats, new Comparator<quanLyNhaDat>() {
            @Override
            public int compare(quanLyNhaDat o1, quanLyNhaDat o2) {
                return Double.compare(o1.getDonGia(), o2.getDonGia());
            }
        });
    }
}

