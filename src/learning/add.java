package learning;

import java.math.BigDecimal;

public class add {
    public static void main(String[] args) {
        //BigDecimal注意：multiply.java
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");
        BigDecimal f = d.add(e);
        System.out.println(f);
    }
}
