package bai3;
import java.util.Scanner;
public class Student {


    // instance field
    private String maSingVien;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    // setter getter method
    public String getMaSingVien() {
        return maSingVien;
    }
    public void setMaSingVien(String maSingVien) {
        this.maSingVien = maSingVien;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }
    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }
    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }
    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    //constructor method

    public Student() {

    }

    public Student(String maSingVien, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maSingVien = maSingVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("nhap ma sinh vien: ");
        this.maSingVien = input.nextLine();
        System.out.println("nhap ho va ten: ");
        this.hoTen = input.nextLine();
        System.out.println("nhap diem toan: ");
        this.diemToan = input.nextDouble();
        System.out.println("nhap diem ly: ");
        this.diemLy = input.nextDouble();
        System.out.println("nhap diem hoa: ");
        this.diemHoa = input.nextDouble();
    }

    public void display() {
        System.out.printf("%-15s %-30s %-14.2f %-10.2f %-12.2f\n", maSingVien, hoTen, diemToan, diemLy, diemHoa);
    }


    public static void main(String[] args) {
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("nhap thong tin cua hoc sinh thu " + (i + 1) + ": ");
            students[i] = new Student();
            students[i].input();
        }
        System.out.printf("%-15s %-30s %-10s %10s %10s\n", "Ma sinh vien", "Ho va ten", "Diem toan", "Diem ly", "Diem hoa");
        for (Student student : students) {
            student.display();
        }
    }
}
