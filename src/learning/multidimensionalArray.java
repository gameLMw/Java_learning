package learning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multidimensionalArray {
    public static void main(String[] args) {
        /*
        Array.deepToString()
        输出多为数组，输出格式为：[][]
         */
        int[][] a = {{1, 2, 3},
                {4, 5,},
                {6,7, 8, 9}};
        System.out.println(Arrays.deepToString( a));
    }
}
