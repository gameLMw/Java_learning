package learning;

public class equals {
    public static void main(String[] args) {
        /*
        ==：比较两个对象的地址是否相同
        equals：比较两个对象的内容是否相同
         */
        String a = "hello world";
        String b = "hello world";
        String c = new String("hello world");
        String d = new String("hello world");
        if (a.equals(b)) {
            System.out.println("1Hello World!");
        }
        if (a == b) {
            System.out.println("2Hello World!");
        }
        if (c == d) {
            System.out.println("3Hello World!");
        }
        if (c.equals(d)) {
            System.out.println("4Hello World!");
        }
        if (a.equals(c)) {
            System.out.println("5Hello World!");
        }
        if (a == c) {
            System.out.println("6Hello World!");
        }
    }
}
