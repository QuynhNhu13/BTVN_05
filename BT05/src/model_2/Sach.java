package model_2;

public class Sach extends ThuVien {

    private int soTrang;

    public Sach(int soTrang, String maTaiLieu, String tenTaiLieu, String nhaXuatBan) {
        super(maTaiLieu, tenTaiLieu, nhaXuatBan);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Bao: " + tenTaiLieu + " - Ma tai lieu: " + maTaiLieu + " - Nha xuat ban: " + nhaXuatBan + " - So trang: " + soTrang;
    }

}
