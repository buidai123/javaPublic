package bai2;
import java.util.Scanner;

public class Rectangle {
    private int D;
    private int R;

    // getter, setter method

    public int getD() {
        return D;
    }
    public void setter(int D) {
        this.D = D;
    }

    public int getR() {
        return R;
    }
    public void setR(int R) {
        this.R = R;
    }

    // constructor method

    public Rectangle() {
    }

    public Rectangle(int dai, int rong) {
        D = dai;
        R = rong;
    }
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        D = input.nextInt();
        System.out.println("nhap chieu rong: ");
        R = input.nextInt();
    }

    public void veHCN() {
        for (int i = 0; i < this.D; i++) {
            for (int j = 0; j < this.R; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public double chuVi() {
        int chuVi = (R + D) * 2;
        return chuVi;
    }

    public double dienTich() {
        int S = R * D;
        return S;
    }


    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();
        hcn.input();
        hcn.veHCN();
        System.out.println("chu vi hinh chu nhat la: " + hcn.chuVi());
        System.out.println("dien tich hinh chu nhat la: " + hcn.dienTich());
    }
}
