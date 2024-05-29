package model_1;

public class GiaoVien extends DoiTuong {

    private String monDay, trinhDo;

    public GiaoVien(String monDay, String trinhDo, String maDoiTuong, String tenDoiTuong, String namSinh, boolean gioiTinh) {
        super(maDoiTuong, tenDoiTuong, namSinh, gioiTinh);
        this.monDay = monDay;
        this.trinhDo = trinhDo;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "Giao vien: " + tenDoiTuong + " - Ma giao vien: " + maDoiTuong + " - Gioi tinh: " + printGioiTinh() + " - Nam sinh: " + namSinh + " - Mon day: " + monDay + " - Trinh do: " + trinhDo;
    }

}
