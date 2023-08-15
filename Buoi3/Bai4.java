import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        String str = inputString();
        if (isPalemdrome(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static String inputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String str = input.nextLine();

        input.close();

        return str;
    }

    public static boolean isPalemdrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
