import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n;
        do {
            System.out.print("nhap gia tri n: ");
            n = sr.nextInt();
        } while (n < 0);
        boolean laSoNguyenTo = true;
        if (n < 2) {
            laSoNguyenTo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
        }
        if (laSoNguyenTo = true) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n +" khong phai la so nguyen to");
        }
    }
}
