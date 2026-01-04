package learning;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class file {
    public static void main(String[] args) throws IOException {
        //读
        Scanner in = new Scanner(Path.of("D:\\code\\HelloWorld.txt"), StandardCharsets.UTF_8);
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();
        //写入
        PrintWriter out = new PrintWriter(new FileWriter("D:\\code\\HelloWorld.txt", StandardCharsets.UTF_8, true));
        out.println("Hello World!");
        out.close();
        System.out.println("写入成功！");
        //重新读
        in = new Scanner(Path.of("D:\\code\\HelloWorld.txt"), StandardCharsets.UTF_8);
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();
    }
}
