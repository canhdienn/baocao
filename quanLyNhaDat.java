abstract class quanLyNhaDat{
    String maGiaoDich;
    int ngayGiaoDich;
    int thangGiaoDich;
    int namGiaoDich;
    double donGia;
    double dienTich;

    public quanLyNhaDat(String maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich,double donGia,double dienTich){
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.thangGiaoDich = thangGiaoDich;
        this.namGiaoDich = namGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    abstract double thanhTien();
    
    public String getMaGiaoDich() {
        return maGiaoDich;
    }
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public int getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(int ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public int getThangGiaoDich() {
        return thangGiaoDich;
    }
    public void setThangGiaoDich(int thangGiaoDich) {
        this.thangGiaoDich = thangGiaoDich;
    }
    public int getNamGiaoDich() {
        return namGiaoDich;
    }
    public void setNamGiaoDich(int namGiaoDich) {
        this.namGiaoDich = namGiaoDich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    

    
}