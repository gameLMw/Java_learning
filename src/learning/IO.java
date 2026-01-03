package learning;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高（m）：");
        double a = sc.nextDouble() ;
        System.out.println("请输入体重（kg）：");
        double b = sc.nextDouble();
        System.out.println("BMI：" + b / (a * a));
    }
}

