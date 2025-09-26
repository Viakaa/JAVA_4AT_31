package aqa.task3;
//Make ArrayList from the result array and perform the following operations:
// a) Add an element to the end of the list;
// b) Remove an element from the list;
// c) Replace an element in the list;
// d) Sort the list in alphabetical order;
// e) Print the elements of the list;
//Make up the situation for ClassCastException. Catch it and display the explanation for your custom case.
import java.util.*;

public class Task3 {
    public static void main(String[] args){
        int [] arr = {5,6,4,2,9};
        int[] arr2 = new int[arr.length];
        for (int i = arr.length - 1;i >= 0; i--){
            arr2[arr.length - i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("--------------------");



        ArrayList<String> arrayList = new ArrayList<>();
        for (int num : arr2) {
            arrayList.add(String.valueOf(num));
        }

        arrayList.add("56");
        System.out.println(arrayList);
        arrayList.remove(3);
        arrayList.set(1, "100");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("--------------------");

        try {
            Integer num = (Integer) (Object) "cool nice amazing";
        } catch (ClassCastException e) {
            System.out.println("Invalid type");
        }
    }
}
