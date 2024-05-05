public class quanLyDat extends quanLyNhaDat{
    protected String loaiDat;

    public quanLyDat(String maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, thangGiaoDich, namGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;

    }
    public static enum LoaiDat {
        A, B, C
    }
    @Override
    double thanhTien() {
        if (loaiDat.equals(LoaiDat.A.name())) {
            return dienTich * donGia * 1.5;
        } else {
            return dienTich * donGia;
        }
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    }
    @Override
    public String toString() {
        return "quanLyDat [maGiaoDich=" + maGiaoDich + ", loaiDat=" + loaiDat + ", ngayGiaoDich=" + ngayGiaoDich
                + ", thangGiaoDich=" + thangGiaoDich + ", namGiaoDich=" + namGiaoDich + ", donGia=" + donGia
                + ", dienTich=" + dienTich + ", daBan=" + DaBan(daBan) + "]";
    }   
}