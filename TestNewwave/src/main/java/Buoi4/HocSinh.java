package Buoi4;

import java.util.Scanner;

public class HocSinh {
    String maHS;
    String tenHS;
    int tuoi;
    int diemToan;
    int diemLy;
    int diemHoa;

    // Constructor
    public HocSinh(String maHS, String tenHS, int tuoi, int diemToan, int diemLy, int diemHoa) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    // Methods
    public void nhapThongTin(Scanner sc){
        sc = new Scanner(System.in);

        System.out.println("Nhập thông tin học sinh");
        System.out.println("Nhập thông tin mã học sinh");
        this.maHS = sc.nextLine();
        System.out.println("Nhập thông tin tên học sinh");
        this.tenHS = sc.nextLine();
        System.out.println("Nhập thông tin tuổi");
        this.tuoi = sc.nextInt();
        System.out.println("Nhập thông tin điểm toán: ");
        this.diemToan = sc.nextInt();
        System.out.println("Nhập thông tin điểm lý: ");
        this.diemLy = sc.nextInt();
        System.out.println("Nhập thông tin điểm hóa: ");
        this.diemHoa = sc.nextInt();
    }

    public void hienThiThongTin(){
        System.out.println("Thông tin của học sinh " + maHS);
        System.out.println("Tên học sinh: " + this.tenHS);
        System.out.println("Mã học sinh: " + this.maHS);
        System.out.println("Tuổi: " + this.tuoi);
        System.out.println("Điểm Toán: " + this.diemToan);
        System.out.println("Điểm Lý: " + this.diemLy);
        System.out.println("Diểm Hóa: " + this.diemHoa);
        System.out.println("Điểm trung bình: " + tinhDiemTrungBinh());
        System.out.println("Xếp loại: Học sinh " + xepLoai());
    }

    public float tinhDiemTrungBinh(){
        float diemTrungBinh = (float) (this.diemToan + this.diemLy + this.diemHoa) / 3;
        return diemTrungBinh;
    }
    
    public String xepLoai() {
        String bacXepLoai = new String();
        if (tinhDiemTrungBinh() >= 5 && tinhDiemTrungBinh() < 6.5){
            bacXepLoai = "Trung bình";
        } else if (tinhDiemTrungBinh() >= 6.5 && tinhDiemTrungBinh() < 8) {
            bacXepLoai = "Khá";
        } else if (tinhDiemTrungBinh() >= 8) {
            bacXepLoai = "Giỏi";
        } else {
            bacXepLoai = "Yếu";
        }

        return bacXepLoai;
    }
}
