package learning;

public class read_data {
    public static void main(String[] args) {
        //read_data带标签的break。可以指定循环标签，跳转指定标签的循环
        read_data:
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
            for (int j = 0; j < 3; j++) {
                System.out.println("World");
                if (j == 1) {
                    //continue read_data;
                    break read_data;
                }
            }

        }
    }
}
