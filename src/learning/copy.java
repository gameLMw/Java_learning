package learning;

import java.util.Arrays;

public class copy {
    public static void main(String[] args) {
        /*
        两者区别：
        1.b是a的引用，b改变a的值，a也会改变。
        2.c是a的副本，c改变a的值，a不会改变。
        3.a和b指向同一个内存地址，a和c指向不同一个内存地址。
         */
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = a;
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }
        b[0]=9;
        System.out.println("------------------");
        int[] c= Arrays.copyOf(a,2*a.length);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
