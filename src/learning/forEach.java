package learning;

public class forEach {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
        }
        // foreach遍历集合（集合类，Iterable接口）
    }
}
