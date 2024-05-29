package model_2;

public class Bao extends ThuVien {

    private int taiBan;

    public Bao(int taiBan, String maTaiLieu, String tenTaiLieu, String nhaXuatBan) {
        super(maTaiLieu, tenTaiLieu, nhaXuatBan);
        this.taiBan = taiBan;
    }

    public int getTaiBan() {
        return taiBan;
    }

    public void setTaiBan(int taiBan) {
        this.taiBan = taiBan;
    }

    @Override
    public String toString() {
        return "Bao: " + tenTaiLieu + " - Ma tai lieu: " + maTaiLieu + " - Nha xuat ban: " + nhaXuatBan + " - Tai ban: " + taiBan;
    }

}
