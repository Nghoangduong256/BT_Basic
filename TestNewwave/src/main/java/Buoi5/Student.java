package Buoi5;

public class Student {
    private int id;
    private String name;
    private double score;

    // Constructor
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Methods
    public void displayInfo(){
        System.out.println("Thông tin của học sinh " );
        System.out.println("Mã học sinh: " + this.id);
        System.out.println("Tên học sinh: " + this.name);
        System.out.println("Điểm: " + this.score);
    }

    public void reset() {
        this.id = 0;
        this.name = "";
        this.score = 0;
        System.out.println("Đã reset thông tin học sinh");
    }
}
