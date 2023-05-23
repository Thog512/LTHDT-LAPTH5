package Lap5;

public class PhongThiNghiem extends PhongHoc{
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String chuyenNganh, int sucChua, boolean coBonRua, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    @Override
    public String toString() {
        return "PhongThiNghiem{" + "chuyenNganh=" + chuyenNganh + ", sucChua=" + sucChua + ", coBonRua=" + coBonRua + '}';
    }
}
