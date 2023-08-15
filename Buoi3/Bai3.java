import java.util.Scanner;
import java.util.ArrayList;
public class Bai3 {

    public static ArrayList<Integer> inputArray() {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = input.nextInt();

        System.out.println("nhap kich thuoc mang");
        for(int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arrList.add(input.nextInt());
        }
        input.close();
        return arrList;
    }

    public static void sortArray(ArrayList<Integer> arrList) {
        int temporary;
        int n = arrList.size();
        for(int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrList.get(j) < arrList.get(i)) {
                    temporary = arrList.get(i);
                    arrList.set(i, arrList.get(j));
                    arrList.set(j, temporary);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = inputArray();

        System.out.println("Mang truoc khi sap xep la: " + arrList);
        sortArray(arrList);
        System.out.println("Mang sau khi sap xep la: " + arrList);
    }
}
