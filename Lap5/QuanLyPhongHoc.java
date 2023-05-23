
package Lap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLyPhongHoc {
    private List<PhongHoc> danhsachPhongHoc;

    public QuanLyPhongHoc(){
        danhsachPhongHoc = new ArrayList<>();
    }
    
    public void themPhongHoc(PhongHoc phongHoc){
        if(!danhsachPhongHoc.contains(phongHoc)){
            danhsachPhongHoc.add(phongHoc);
            System.out.println("Them phong hoc thanh cong");
        }else{
            System.out.println("Phong hoc da ton tai");
        }
    }
    
    public QuanLyPhongHoc(List<PhongHoc> danhsachPhongHoc) {
        this.danhsachPhongHoc = danhsachPhongHoc;
    }
    
    public boolean timPhongHoc(String maPhong){
        for(PhongHoc phongHoc : danhsachPhongHoc){
            if(phongHoc.getMaPhong().equals(maPhong)){
                return true;
            }
        }return false;
    }
    
    public void inDanhSachPhonHoc(){
        System.out.println("Danh sach cac phong hoc: ");
        for (PhongHoc phongHoc : danhsachPhongHoc){
            System.out.println(phongHoc.toString());
        }
    }
    
    public void inDanhSachPhongDatChuan(){
        System.out.println("Dach sach cac phong dat chuan: ");
        for(PhongHoc phongHoc : danhsachPhongHoc){
            if(phongHoc instanceof PhongLyThuyet){
                PhongLyThuyet phongLyThuyet = (PhongLyThuyet) phongHoc;
                if (phongLyThuyet.isMayChieu()){
                    System.out.println(phongLyThuyet.toString());
                }
            } else if (phongHoc instanceof PhongMayTinh){
                PhongMayTinh phongMayTinh = (PhongMayTinh) phongHoc;
                if(phongMayTinh.getDienTich()/phongMayTinh.getSoMayTinh() >= 1.5){
                    System.out.println(phongMayTinh.toString());
                }
            } else if (phongHoc instanceof PhongThiNghiem){
                PhongThiNghiem phongThiNghiem = (PhongThiNghiem) phongHoc;
                if(phongThiNghiem.isCoBonRua()){
                    System.out.println(phongThiNghiem.toString());
                }
            }
        }
    }
    
    public void sapXepTheoDayNha(){
        Collections.sort(danhsachPhongHoc, Comparator.comparing(PhongHoc::getDayNha));
    }
    
    public void sapXepTheoDienTich(){
        Collections.sort(danhsachPhongHoc, Comparator.comparing(PhongHoc::getSoBongDen));
    }
    
    public void sapXepTheoSoBongDen(){
        Collections.sort(danhsachPhongHoc, Comparator.comparingInt(PhongHoc::getSoBongDen));
    }
    public void capNhatSoMayTinh(String maPhong, int soMayTinhMoi) {
        PhongHoc phongHoc = timPhongHoc(maPhong);
        if (phongHoc instanceof PhongMayTinh) {
            PhongMayTinh mayTinh = (PhongMayTinh) phongHoc;
            mayTinh.setSoMayTinh(soMayTinhMoi);
            System.out.println("Cập nhật số máy tính thành công.");
        } else {
            System.out.println("Phòng không phải là phòng máy tính.");
        }
    }

    public void xoaPhongHoc(String maPhong) {
        PhongHoc phongHoc = timPhongHoc(maPhong);
        if (phongHoc != null) {
            danhSachPhongHoc.remove(phongHoc);
            System.out.println("Xóa phòng học thành công.");
        } else {
            System.out.println("Không tìm thấy phòng học có mã phòng " + maPhong);
        }
    }

    public void inTongSoPhongHoc() {
        System.out.println("Tổng số phòng học: " + danhsachPhongHoc.size());
    }

    public void inDanhSachPhongMayCo60May() {
        for (PhongHoc phongHoc : danhsachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh) {
                PhongMayTinh mayTinh = (PhongMayTinh) phongHoc;
                if (mayTinh.getSoMayTinh() == 60) {
                    System.out.println(phongHoc);
                }
            }
        }
    }
}
