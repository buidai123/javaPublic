import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("nhap so a: ");
        a = sc.nextDouble();
        System.out.print("nhap so b: ");
        b = sc.nextDouble();
        System.out.print("nhap so c: ");
        c = sc.nextDouble();

        double delta = b*b - 4 * a * c;
        if (delta >= 0) {
            double t1 = (-b + Math.sqrt(delta)) / (2 * a);
            double t2 = (-b - Math.sqrt(delta)) / (2 * a);

            //tinh nghiem x
            double x1 = Math.sqrt(t1);
            double x2 = -x1;
            double x3 = Math.sqrt(t2);
            double x4 = -x3;

            System.out.printf("Phuong trinh %.2fx^4 ", a);
            if (b >= 0) {
                System.out.printf("+ %.2fx^2 ", b);
            } else {
                System.out.printf("- %.2fx^2 ", -b);
            }
            if (c >= 0) {
                System.out.printf("+ %.2f = 0", c);
                System.out.println();
            } else {
                System.out.printf("- %.2f = 0 ", c);
                System.out.println();
            }
            if ((t1 >= 0) && (t2 >= 0)) {
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
                System.out.printf("x3 = %.2f\n", x3);
                System.out.printf("x4 = %.2f\n", x4);
            } else if ((t1 >= 0) && t2 < 0) {
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
            } else if ((t1 < 0) && (t2 >= 0)) {
                System.out.printf("x1 = %.2f\n", x3);
                System.out.printf("x2 = %.2f\n", x4);
            }
        } else {
            System.out.println("phuong trinh vo nghiem!");
        }
    }
}
