package learning;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        System.out.println("------------------");
        for (int i : a)
            System.out.println(i);
        System.out.println("------------------");
        a = new int[]{6, 7, 8, 9, 10};
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        System.out.println("------------------");
        System.out.println(Arrays.toString(a));
        System.out.println("------------------");
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }
        System.out.println("------------------");
        for (int i : b)
            System.out.println(i);
    }
}
