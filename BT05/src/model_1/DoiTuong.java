package model_1;

public class DoiTuong {

    protected String maDoiTuong, tenDoiTuong, namSinh;
    protected boolean gioiTinh;

    public DoiTuong(String maDoiTuong, String tenDoiTuong, String namSinh, boolean gioiTinh) {
        this.maDoiTuong = maDoiTuong;
        this.tenDoiTuong = tenDoiTuong;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }
    
    public String printGioiTinh(){
        if(gioiTinh){
            return "Nu";
        } else {
            return "Nam";
        }
    }

    public String getMaDoiTuong() {
        return maDoiTuong;
    }

    public void setMaDoiTuong(String maDoiTuong) {
        this.maDoiTuong = maDoiTuong;
    }

    public String getTenDoiTuong() {
        return tenDoiTuong;
    }

    public void setTenDoiTuong(String tenDoiTuong) {
        this.tenDoiTuong = tenDoiTuong;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "DoiTuonng{" + "maDoiTuong=" + maDoiTuong + ", tenDoiTuong=" + tenDoiTuong + ", gioiTinh=" + printGioiTinh() + ", namSinh=" + namSinh + '}';
    }

}
