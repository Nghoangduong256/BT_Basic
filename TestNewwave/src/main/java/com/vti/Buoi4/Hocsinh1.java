package buoi5;

import java.util.Scanner;

public class Hocsinh {
    int maHS;
    String tenHs;
    int tuoi;
    int diemToan;
    int diemLy;
    int diemHoa;

    public Hocsinh(int maHS, String tenHs, int tuoi, int diemToan, int diemLy, int diemHoa) {
        this.maHS = maHS;
        this.tenHs = tenHs;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    // Lỗi 1: hàm Main phải để 1 class riêng, ko ghép chung với class Object
    // Tóm tắt lý thuyết:
    // - Object: Muốn tạo 1 đối tượng (Object) ta cần tạo 1 class cho nó, 
    // trong đó khai bào thuộc tính (attributes) và phương thức (methods),
    // không sử dụng để chạy chương trình, cứ hình dung nó là 1 cái khuôn
    // - Instance: Đây là 1 ĐỐI TƯỢNG CỤ THỂ được tạo ra từ khuôn Object,
    // instance sẽ được khai báo ở trong class Main
    // - Class Main: đây sẽ là class chạy chương trình chính ở trong Java,
    // không được để lẫn ở trong class Object
 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int maHS = scanner.nextInt();
        System.out.println("nhap ma hoc sinh:");
        String tenHS = scanner.next();
        System.out.println(" nhap ten hoc sinh:");
        int tuoi = scanner.nextInt();
        System.out.println("nhap tuoi:");
        int diemToan = scanner.nextInt();
        System.out.println("nhap diem toan:");
        int diemLy = scanner.nextInt();
        System.out.println("nhap diem ly:");
        int diemHoa = scanner.nextInt();
        System.out.println("nhap diem hoa:");
        int diemTrungBinh = (diemToan+diemHoa+diemLy)/3;
        if (diemTrungBinh>=8){
            System.out.println("gioi");
        }else if (diemTrungBinh>=6.5){
            System.out.println("kha");
        }else if ( diemTrungBinh>=5){
            System.out.println("trung binh");
        }else{
            System.out.println("yeu");
        }
    }
}
