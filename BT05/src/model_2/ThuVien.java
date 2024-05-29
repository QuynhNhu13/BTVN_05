package model_2;

public class ThuVien {

    protected String maTaiLieu, tenTaiLieu, nhaXuatBan;

    public ThuVien(String maTaiLieu, String tenTaiLieu, String nhaXuatBan) {
        this.maTaiLieu = maTaiLieu;
        this.tenTaiLieu = tenTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return "ThuVien{" + "maTaiLieu=" + maTaiLieu + ", tenTaiLieu=" + tenTaiLieu + ", nhaXuatBan=" + nhaXuatBan + '}';
    }

}
