import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manage{
    public List<quanLyNhaDat> listnNhaDats;

    public Manage() {
        listnNhaDats = new ArrayList<>();
    }
    /////////////// Them giao dich
    public void addTransaction(quanLyNhaDat transaction) {
        listnNhaDats.add(transaction);
    }

    ///////////// In tat ca cac giao dich ra
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
    //////////Tinh Tong so luong tung loai
    public int findSoLuongDat() {
        int count = 0;

        for (quanLyNhaDat transaction : listnNhaDats) {
            if (transaction instanceof quanLyDat) {
                count++;
            }
        }
        return count;
    }

    public int findSoLuongNha() {
        int count = 0;

        for (quanLyNhaDat transaction : listnNhaDats) {
            if (transaction instanceof quanLyNha) {
                count++;
            }
        }
        return count;
    }
    ////////// Xuat cac giao dich theo thang va nam
    public void printTransactionsByDate(int month, int year) {
        boolean found = false;
        for (quanLyNhaDat transaction : listnNhaDats) {
            if (transaction.thangGiaoDich == month && transaction.namGiaoDich == year){
                System.out.println(transaction.toString());
                found = true;
            }
        }
        if (!found) System.out.println("Not found, please try again!!");
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

    /////////// Sap xep theo don gia
    public void sortTransactionsByPrice() {
        Collections.sort(listnNhaDats, new Comparator<quanLyNhaDat>() {
            @Override
            public int compare(quanLyNhaDat o1, quanLyNhaDat o2) {
                return Double.compare(o1.getDonGia(), o2.getDonGia());
            }
        });
    }

    ///////// Update Don gia
    public void updateDonGia(String transactionId, double donGia) {
        boolean found = false;
        for (quanLyNhaDat transaction : listnNhaDats) {
            if (transaction.getMaGiaoDich().equals(transactionId)) {
                if (transaction instanceof quanLyDat) {
                    ((quanLyDat) transaction).setDonGia(donGia);
                } else if (transaction instanceof quanLyNha) {
                    ((quanLyNha) transaction).setDonGia(donGia);
                }
                found = true;
                break;
            }
        } if (!found) System.out.println("Not found Transastion, please try again!!");
    }
    public void print1Transaction(String transactionId) {
        for (quanLyNhaDat transaction : listnNhaDats) {
            if (transaction.getMaGiaoDich().equals(transactionId)) {
                System.out.println(transaction.toString());
                break;
            }
        }
    }

    ////////// Them trang thai da ban
    public void updateDaBan(String transactionId, boolean daBanhaychua, double soTienBan) {
        boolean found = false;
        for (quanLyNhaDat transaction : listnNhaDats) {
            if (transaction.getMaGiaoDich().equals(transactionId)) {
                if (transaction instanceof quanLyDat) {
                    ((quanLyDat) transaction).setDaBan(daBanhaychua);
                    if (soTienBan > transaction.thanhTien()) System.out.println("Giao dich sinh LOI");
                    else System.out.println("Giao dich sinh LO");
                } else if (transaction instanceof quanLyNha) {
                    ((quanLyNha) transaction).setDaBan(daBanhaychua);
                    if (soTienBan > transaction.thanhTien()) System.out.println("Giao dich sinh LOI");
                    else System.out.println("Giao dich sinh LO");
                }
                found = true;
                break;
            }
        } if (!found) System.out.println("Not found Transastion, please try again!!");
    }
}