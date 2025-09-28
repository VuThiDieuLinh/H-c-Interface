import java.util.*;

class Employee {
    protected String ten ;
    protected int tuoi;
    protected double luong;

    public Employee(String ten , int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public double tinhluong() {
        return luong;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten + "- Tuổi: " + tuoi + "- Lương: " + tinhluong());
    }
}

class OfficeEmployee extends Employee {
    private int soNgayLamViec;
    private static final double LUONG_MOI_NGAY = 100;

    public OfficeEmployee(String ten , int tuoi, int soNgayLamViec) {
        super(ten, tuoi);
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public double tinhluong() {
        luong = soNgayLamViec*LUONG_MOI_NGAY;
        return luong;
    }
}

class TechnicalEmployee extends Employee  {
    private int soGioLamViec;
    private double tienCongTheoGio;

    public TechnicalEmployee (String ten, int tuoi, int soGioLamViec, double tienCongTheoGio) {
        super(ten, tuoi);
        this.soGioLamViec = soGioLamViec;
        this.tienCongTheoGio = tienCongTheoGio;
    }

    @Override
    public double tinhluong() {
        luong= soGioLamViec*tienCongTheoGio;
        return luong;
    }
}

public class QuanLyNhanVien {
    public static void main(String[] args) {
        Employee nvien1 = new OfficeEmployee("Vu Thi Dieu Linh", 20, 30);
        Employee nvien2 = new TechnicalEmployee("Dao Minh Quan", 20, 24, 105);

        nvien1.hienThiThongTin();
        nvien2.hienThiThongTin();
    }
}