package learning;

import java.math.BigDecimal;

public class multiply {
    public static void main(String[] args) {
        /*
        BigDecimal注意：
        1.精度丢失：double 丢失精度，BigDecimal 不丢失精度。
        2.运算速度：BigDecimal 运算速度比 double 慢很多。
         */
        double a = 0.1;
        double b = 0.2;
        double c = a * b;
        System.out.println(c);
        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");
        BigDecimal f = d.multiply(e);
        System.out.println(f);
    }
}
