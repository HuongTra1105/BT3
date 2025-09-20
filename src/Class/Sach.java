package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tacGia123;   
    private int soTrang123;     

    public Sach() {

    }

    public Sach(String maTaiLieu123, String tenNXB123, int soBanPhatHanh123, String tacGia123, int soTrang123) {
        super(maTaiLieu123, tenNXB123, soBanPhatHanh123);
        this.tacGia123 = tacGia123;
        this.soTrang123 = soTrang123;
    }

    public void nhapThongTin(Scanner sc123) {
        super.nhapThongTin(sc123);
        System.out.print("\tNhap tac gia: ");
        tacGia123 = sc123.nextLine();
        System.out.print("\tNhap so trang: ");
        soTrang123 = sc123.nextInt();
        sc123.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTac gia: " + tacGia123);
        System.out.println("\tSo trang: " + soTrang123);
    }
}
