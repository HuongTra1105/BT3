package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dstl123;   

    public QuanLySach() {
        dstl123 = new ArrayList<TaiLieu>(10);
    }

    public void themTaiLieu(TaiLieu tl123) {
        dstl123.add(tl123);
    }

    public void nhapDanhSachTL(Scanner sc123) {
        int chon123;
        String stop123;
        TaiLieu tl123;

        do {
            System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
            chon123 = sc123.nextInt();
            sc123.nextLine();

            switch (chon123) {
                case 1:
                    tl123 = new Sach();
                    break;
                case 2:
                    tl123 = new TapChi();
                    break;
                case 3:
                    tl123 = new Bao();
                    break;
                default:
                    tl123 = new Sach();
                    break;
            }

            tl123.nhapThongTin(sc123);
            themTaiLieu(tl123);

            System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
            stop123 = sc123.nextLine();
        } while (stop123.equals("c"));
    }

    public void timMaTL(String maTL123) {
        for (TaiLieu tl123 : dstl123) {
            if (maTL123.equals(tl123.getMaTaiLieu123())) {
                tl123.hienThiThongTin();
            }
        }
    }

    public void timLoaiTL(String loai123) {
        for (TaiLieu tl123 : dstl123) {
            if (loai123.equals("Sach") && (tl123 instanceof Sach)) {
                tl123.hienThiThongTin();
            } else if (loai123.equals("TapChi") && (tl123 instanceof TapChi)) {
                tl123.hienThiThongTin();
            } else if (loai123.equals("Bao") && (tl123 instanceof Bao)) {
                tl123.hienThiThongTin();
            }
        }
    }
}
