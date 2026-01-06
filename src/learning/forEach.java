package learning;

public class forEach {
    public static void main(String[] args) {
        /*
        for each循环,遍历数组
         */
        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
        }
        int[][] b = {{1, 2, 3},
                {4, 5,},
                {6,7, 8, 9}};
        for(int[] i:b){
            for(int j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}