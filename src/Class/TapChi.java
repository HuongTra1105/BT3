package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh123;
    private int thangPhatHanh123;

    public TapChi() {

    }

    public TapChi(String maTaiLieu123, String tenNXB123, int soBanPhatHanh123, int soPhatHanh123, int thangPhatHanh123) {
        super(maTaiLieu123, tenNXB123, soBanPhatHanh123);
        this.soPhatHanh123 = soPhatHanh123;
        this.thangPhatHanh123 = thangPhatHanh123;
    }

    public void nhapThongTin(Scanner sc123) {
        super.nhapThongTin(sc123);
        System.out.print("\tNhap so phat hanh: ");
        soPhatHanh123 = sc123.nextInt();
        System.out.print("\tNhap thang phat hanh: ");
        thangPhatHanh123 = sc123.nextInt();
        sc123.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phat hanh: " + soPhatHanh123);
        System.out.println("\tThang phat hanh: " + thangPhatHanh123);
    }
}
