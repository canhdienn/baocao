public class quanLyNha extends quanLyNhaDat{
    private String loaiNha;
    private String diaChi;
    
    public quanLyNha(String maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, thangGiaoDich, namGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }
    @Override
    double thanhTien() {
        if (loaiNha.equals("cao cap")) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }
}
