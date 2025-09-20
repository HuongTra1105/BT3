package Class;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu123;
    private String tenNXB123;
    private int soBanPhatHanh123;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu123, String tenNXB123, int soBanPhatHanh123) {
        this.maTaiLieu123 = maTaiLieu123;
        this.tenNXB123 = tenNXB123;
        this.soBanPhatHanh123 = soBanPhatHanh123;
    }
    public void nhapThongTin(Scanner sc123) {
        System.out.print("\tNhap ma tai lieu: ");
        maTaiLieu123 = sc123.nextLine();
        System.out.print("\tNhap ten nha xuat ban: ");
        tenNXB123 = sc123.nextLine();
        System.out.print("\tNhap so ban phat hanh: ");
        soBanPhatHanh123 = sc123.nextInt();
        sc123.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tMa tai lieu: " + maTaiLieu123);
        System.out.println("\tTen nha xuat ban: " + tenNXB123);
        System.out.println("\tSo ban phat hanh: " + soBanPhatHanh123);
    }

    public String getMaTaiLieu123() {
        return maTaiLieu123;
    }
}
