package he.learning.jdk.demo.java.util.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 朱科睿
 */
public class SetDemo {

    public static void main(String[] args) {

/*        Set<Integer> set = new HashSet<>();
        set.add(14);
        set.add(15);
        set.add(12);
        set.add(null);
        set.add(14);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(set);
        set.forEach(System.out::println);
        System.out.println("-----");
        linkedHashSet.forEach(System.out::println);*/


        Set<Object> treeSet = new HashSet<>();
        treeSet.add("aa");
        treeSet.add("bb");
        treeSet.add("cc");
        treeSet.add("dd");
        treeSet.add(1);
        treeSet.add(23.2f);
        treeSet.forEach(System.out::println);

    }
}
