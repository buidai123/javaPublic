import java.util.Scanner;
import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = inputArray();
        countElementOccurrences(arrayList);
    }
    public static ArrayList<Integer> inputArray() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arrayList.add(input.nextInt());
        }
        input.close();

        return arrayList;
    }

    public static void countElementOccurrences(ArrayList<Integer> arrayList) {
        ArrayList<Integer> checkedList = new ArrayList<Integer>();
        for (Integer num : arrayList){
            if (checkedList.contains(num) == false) {
                int occurrences = 0;
                for (Integer element : arrayList) {
                    if(element.equals(num)) {
                        occurrences++;
                    }
                }
                System.out.println("so " + num + " xuat hien " + occurrences + " lan");
                checkedList.add(num);
            }
        }
    }
}