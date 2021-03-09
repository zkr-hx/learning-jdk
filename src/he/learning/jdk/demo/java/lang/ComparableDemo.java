package he.learning.jdk.demo.java.lang;

import java.math.BigDecimal;

/**
 * @author 朱科睿
 */
public class ComparableDemo {

    public static void main(String[] args) {

        // 1.0和1.00的compareTo结果：0
        // 1.0和1.00的equals结果：true
        BigDecimal num1DoubleToString = new BigDecimal(Double.toString(1.0));
        BigDecimal num2DoubleToString = new BigDecimal(Double.toString(1.00));

        // 1.0和1.00的compareTo结果：0
        // 1.0和1.00的equals结果：false
        BigDecimal num1String = new BigDecimal("1.0");
        BigDecimal num2String = new BigDecimal("1.00");

        // 1.0和1.00的compareTo结果：0
        // 1.0和1.00的equals结果：true
        BigDecimal num1Double = new BigDecimal(1.0);
        BigDecimal num2Double = new BigDecimal(1.00);

        // 1.0和1.00的compareTo结果：0
        // 1.0和1.00的equals结果：true
        BigDecimal num1ValueOf = BigDecimal.valueOf(1.0);
        BigDecimal num2ValueOf = BigDecimal.valueOf(1.00);

        System.out.println("1.0和1.00的compareTo结果：" + num1ValueOf.compareTo(num2ValueOf));
        System.out.println("1.0和1.00的equals结果：" + num1ValueOf.equals(num2ValueOf));
    }
}
