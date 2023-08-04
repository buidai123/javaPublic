import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("nhap gia tri cua n: ");
            n = sc.nextInt();
        } while (n < 0);
        // cau a
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S = 1.0 / i;
        }
        System.out.println("gia tri cua S la = " + S);

        // cau b

        int ftr = 1;
        int P = 0;
        for (int i =1; i <= n; i++) {
            ftr *= i;
            P += ftr;
        }
        System.out.println("gia tri cua P la = " + P);
    }
}
