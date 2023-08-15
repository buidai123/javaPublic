import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class Bai2 {

    public static  ArrayList<Integer> inputArray() {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        System.out.print("nhap kich thuoc mang: ");
        int n = input.nextInt();

        System.out.println("nhap cac phan tu mang:");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arrList.add(input.nextInt());
        }
        return arrList;
    }

    public static void addElement(ArrayList<Integer> arrList) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vi tri can chen: ");
        int pos = input.nextInt();
        System.out.print("Nhap gia tri can chen: ");
        int value = input.nextInt();

        if (pos < 0 || pos > arrList.size()) {
            System.out.println("vi tri khong hop le!");
            return;
        }
        arrList.add(pos, value);
    }

    public static void removeElement(ArrayList<Integer> arrList) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vi tri can xoa: ");
        int pos = input.nextInt();

        if (pos < 0 || pos >= arrList.size()) {
            System.out.println("vi tri khong hop le!");
            return;
        }
        arrList.remove(pos);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = inputArray();

        //add element
        System.out.println("mang ban dau: " + arrList);
        addElement(arrList);
        System.out.println("mang sau khi chen: " + arrList);

        //remove element
        removeElement(arrList);
        System.out.println("mang sau khi xoa: " + arrList);
    }
}
