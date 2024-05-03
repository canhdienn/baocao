public class quanLyDat extends quanLyNhaDat{
    String loaiDat;

    public quanLyDat(String maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, thangGiaoDich, namGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;

    }
    @Override
    double thanhTien() {
        if (loaiDat.equals("A")) {
            return dienTich * donGia * 1.5;
        } else {
            return dienTich * donGia;
        }
    }
    
    
}
