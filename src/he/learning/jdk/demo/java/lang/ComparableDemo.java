package he.learning.jdk.demo.java.lang;

import java.util.Objects;

/**
 * Virtually all Java core classes that implement Comparable have natural orderings that are consistent with equals.
 * One exception is java.math.BigDecimal, whose natural ordering equates BigDecimal objects with equal values and
 * different precisions (such as 4.0 and 4.00).
 *
 * 除了{@code BigDecimal},其他继承了{@code Comparable}接口的Java核心类，其{@code compareTo}方法和{@code equals}方法的表现是一致的。
 * （表现一致的含义：若compareTo认为两个类大小一致，则equals方法返回true。）
 * {@code BigDecimal}在{@code val}一致，{@code scale}不同的情况下，{@code compareTo}方法返回{@code 0}，
 * 但{@code equals}方法返回{@code false}。
 *
 * @author 朱科睿
 */
public class ComparableDemo {

    public static void main(String[] args) {

        // 1.0和1.00的compareTo结果：0
        // 1.0和1.00的equals结果：true
        // 以double的形式构造，自动将小数位数格式化为1
/*        BigDecimal num1DoubleToString = new BigDecimal(Double.toString(1.0d));
        BigDecimal num2DoubleToString = new BigDecimal(Double.toString(1.00d));
        System.out.println(num1DoubleToString.scale() + ", " + num2DoubleToString.scale());*/

        // 1.0和1.00的compareTo结果：0
        // 1.0和1.00的equals结果：false
        // 以字符串的形式构造，保留了原始的小数位数
/*        BigDecimal num1String = new BigDecimal("1.0");
        BigDecimal num2String = new BigDecimal("1.00");
        System.out.println(num1String.scale() + ", " + num2String.scale());*/

        // 1.0和1.00的compareTo结果：0
        // 1.0和1.00的equals结果：true
        // 以double的形式构造，自动将小数位数格式化为1
/*        BigDecimal num1Double = new BigDecimal(1.0);
        BigDecimal num2Double = new BigDecimal(1.00);
        System.out.println(num1Double.scale() + ", " + num2Double.scale());*/

        // 1.0和1.00的compareTo结果：0
        // 1.0和1.00的equals结果：true
        // 以double的形式构造，自动将小数位数格式化为1
/*        BigDecimal num1ValueOf = BigDecimal.valueOf(1.0);
        BigDecimal num2ValueOf = BigDecimal.valueOf(1.00);
        System.out.println(num1ValueOf.scale() + ", " + num2ValueOf.scale());

        System.out.println("1.0和1.00的compareTo结果：" + num1ValueOf.compareTo(num2ValueOf));
        System.out.println("1.0和1.00的equals结果：" + num1ValueOf.equals(num2ValueOf));*/

        TestA testA = new TestA();
        testA.setId(1);

        TestA testA2 = new TestA();
        testA2.setId(1);

        System.out.println(testA.compareTo(testA2));
        System.out.println(testA.equals(testA2));
    }

    static class TestA implements Comparable<TestA> {
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public int compareTo(TestA o) {
            return Integer.compare(o.getId(), id);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestA testA = (TestA) o;
            return id == testA.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

    }
}
