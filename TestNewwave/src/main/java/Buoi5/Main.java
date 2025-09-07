package Buoi5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo sẵn List học sinh
        ArrayList<Student> studentList = new ArrayList<>();
        Student student1 = new Student(1, "Nguyễn Văn An", 89);
        Student student2 = new Student(2, "Trần Thị Mai", 69);
        Student student3 = new Student(3, "Lê Anh Tuấn", 58);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        // Hiển thị thông báo chức năng
        System.out.println("Hãy chọn chức năng:");
        System.out.println("1. Tạo mới học sinh");
        System.out.println("2. Hiển thị thông tin học sinh");
        System.out.println("3. Cập nhật điểm của học sinh");
        System.out.println("4. Xóa dữ liệu học sinh");
        System.out.println("5. In danh sách ");
        System.out.println("0. Kết thúc chương trình");

        // Nhập chức năng
        System.out.println("Nhập chức năng: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Xử lý chức năng
        switch (choice) {
            case 1 :
                System.out.println("Xin vui lòng nhập thông tin học sinh");
                System.out.println("Nhập mã học sinh");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập tên học sinh");
                String name = scanner.nextLine();
                System.out.println("Nhập điểm: ");
                double score = scanner.nextDouble();
                Student s = createStudent(id, name, score);
                studentList.add(s);
                break;
            case 2 :
                System.out.println("Hãy nhập học sinh muốn hiển thị");
                scanner.nextLine();
                String studentName = scanner.nextLine();
                readStudent(studentList,studentName);
                break;
            case 3 :
                System.out.println("Hãy nhập học sinh cần chỉnh sửa: ");
                scanner.nextLine();
                String updateStudent = scanner.nextLine();
                System.out.println("Nhập điểm mới: ");
                double newScore = scanner.nextDouble();
                updateScoreStudent(studentList,updateStudent,newScore);
                break;
            case 4:
                System.out.println("Hãy nhập học sinh muốn xóa: ");
                scanner.nextLine();
                String deleteStudent = scanner.nextLine();
                deleteStudent(studentList, deleteStudent);
                break;
            case 5:
                System.out.println("Danh sách học sinh: ");
                for (int i = 0; i < studentList.size(); i++){
                    System.out.println(studentList.get(i).getName());
                }
                break;
            default:
        }

    }

    public static Student createStudent(int id, String name, double score){
        //validate id
        if (id == 0) {
            throw new RuntimeException("Mã học sinh không hợp lệ. Vui lòng nhập lại.");
        }
        //validate name
        if (name.isEmpty()){
            throw new RuntimeException("Tên học sinh không hợp lệ. Vui lòng nhập lại.");
        }
        //validate score
        if (score == 0){
            throw new RuntimeException("Điểm của học sinh không hợp lệ. Vui lòng nhập lại.");
        }

        Student student = new Student(id,name,score);
        System.out.println("Đăng ký học sinh thành công");
        return student;
    }

    public static void readStudent (ArrayList<Student> studentList, String studentName){
        Student foundStudent = null;
        for (int i = 0; i < studentList.size(); i++){
            if (studentName.equals(studentList.get(i).getName())){
                studentList.get(i).displayInfo();
                foundStudent = studentList.get(i);
            }
        }

        if (foundStudent == null) {
            System.out.println("Không tìm thấy học sinh");
        }
    }

    public static void updateScoreStudent (ArrayList<Student> studentList, String studentName, double newScore) {
        Student foundStudent = null;
        int position = 0;

        for (int i = 0; i < studentList.size(); i++){
            if (studentName.equals(studentList.get(i).getName())){
                foundStudent = studentList.get(i);
                position = i;
            }
        }

        if (foundStudent == null) {
            System.out.println("Không tìm thấy học sinh");
        } else {
            studentList.get(position).setScore(newScore);
            studentList.get(position).displayInfo();
            System.out.println("Đã cập nhật thành công học sinh");
        }
    }

    public static void deleteStudent (ArrayList<Student> studentList, String studentName){
        Student foundStudent = null;
        int position = 0;

        for (int i = 0; i < studentList.size(); i++){
            if (studentName.equals(studentList.get(i).getName())){
                foundStudent = studentList.get(i);
                position = i;
            }
        }

        if (foundStudent == null) {
            System.out.println("Không tìm thấy học sinh");
        } else {
            studentList.get(position).reset();
            System.out.println("Đã xóa thành công học sinh");
        }
    }
}
