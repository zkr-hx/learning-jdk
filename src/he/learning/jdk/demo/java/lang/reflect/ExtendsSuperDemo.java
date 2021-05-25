package he.learning.jdk.demo.java.lang.reflect;

import static he.learning.jdk.demo.java.lang.reflect.TypeDemo.*;

/**
 * @author 朱科睿
 */
public class ExtendsSuperDemo {

    public static void main(String[] args) {
        final Pair<Integer> pair = new Pair<>(12, 23);
        final int result = add(pair);
        System.out.println(result);

        final Class<? super String> superclass = String.class.getSuperclass();
        System.out.println();
    }

    static int add(Pair<? super Integer> p) {
        final Integer first = (Integer) p.getFirst();
        final Integer last = (Integer) p.getLast();
        return first + last;
    }
}
