
package Lap5;

public class PhongLyThuyet extends PhongHoc{
    private boolean mayChieu;

    public PhongLyThuyet(boolean mayChieu, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.mayChieu = mayChieu;
    }

    public boolean isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }
    
    public boolean ismayChieu(){
        return mayChieu;
    }

    @Override
    public String toString() {
        return "PhongLyThuyet{" + "mayChieu=" + mayChieu + '}';
    }
}
