package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generic {

    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        transformToList(array);
        System.out.println();
        swap(array, 1, 5);
    }

    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
        System.out.println(Arrays.toString(arr));
    }

    public static void transformToList(int[] oldArray) {
        Integer[] newArray = new Integer[oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        List<Integer> list = Arrays.asList(newArray);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
