package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh123;  
    public Bao() {

    }

    public Bao(String maTaiLieu123, String tenNXB123, int soBanPhatHanh123, String ngayPhatHanh123) {
        super(maTaiLieu123, tenNXB123, soBanPhatHanh123);
        this.ngayPhatHanh123 = ngayPhatHanh123;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap ngay phat hanh: ");
        ngayPhatHanh123 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNgay phat hanh: " + ngayPhatHanh123);
    }
}
