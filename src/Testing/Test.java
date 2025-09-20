package Testing;

import java.util.Scanner;
import Class.QuanLySach;

public class Test {

    public static void main(String[] args) {
        Scanner sc123 = new Scanner(System.in);

        QuanLySach qls123 = new QuanLySach();

        qls123.nhapDanhSachTL(sc123);

        System.out.print("\n\nNhap vao loai tai lieu can tim: ");
        String loai123 = sc123.nextLine();
        qls123.timLoaiTL(loai123);

        System.out.print("\n\nNhap vao ma tai lieu can tim: ");
        String maTL123 = sc123.nextLine();
        qls123.timMaTL(maTL123);

        sc123.close();
    }
}
