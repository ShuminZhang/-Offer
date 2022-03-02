package Offer11;

import java.util.*;

public class Offer11 {
    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length - 1;
        while (r > l) {
            int m = (l + r) / 2;
            if (numbers[r] < numbers[m]) {
                l = m + 1;
            } else if (numbers[r] > numbers[m]) {
                r = m;
            } else if (numbers[r] == numbers[m]) {
                r--;
            }
        }
        return numbers[l];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toString();
        String[] arr = str.split(",");
        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }
        Offer11 o = new Offer11();
        System.out.println(o.minArray(array));
        sc.close();
    }
}
