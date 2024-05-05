public class quanLyNha extends quanLyNhaDat{
    protected String loaiNha;
    protected String diaChi;
    
    public quanLyNha(String maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, thangGiaoDich, namGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }
    public static enum LoaiNha {
        CaoCap, Thuong;
    }
    @Override
    double thanhTien() {
        if (loaiNha.equals(LoaiNha.CaoCap.name())) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    }
    @Override
    public String toString() {
        return "quanLyNha [maGiaoDich=" + maGiaoDich + ", loaiNha=" + loaiNha + ", ngayGiaoDich=" + ngayGiaoDich
                + ", diaChi=" + diaChi + ", thangGiaoDich=" + thangGiaoDich + ", namGiaoDich=" + namGiaoDich
                + ", donGia=" + donGia + ", dienTich=" + dienTich + ", daBan=" + DaBan(daBan) + "]";
    }
    
}
