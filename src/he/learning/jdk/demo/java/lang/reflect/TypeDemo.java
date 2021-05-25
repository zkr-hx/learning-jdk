package he.learning.jdk.demo.java.lang.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author 朱科睿
 */
public class TypeDemo {

    public static void main(String[] args) {
        final Class<IntPair> intPairClass = IntPair.class;
        final Type genericSuperclass = intPairClass.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            final ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            // 可能包含多个泛型
            final Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            // 取第一个泛型（实际中，根据需要取泛型）
            final Type actualTypeArgument = actualTypeArguments[0];
            // final Class<?> typeArgument = (Class<?>) actualTypeArgument;
            System.out.println(actualTypeArgument);
        }
    }

    public static class Pair<T> {
        private final T first;
        private final T last;
        public Pair(T first, T last) {
            this.first = first;
            this.last = last;
        }
        public T getFirst() {
            return first;
        }
        public T getLast() {
            return last;
        }
    }

    static class IntPair extends Pair<Integer> {
        public IntPair(Integer first, Integer last) {
            super(first, last);
        }
    }
}
