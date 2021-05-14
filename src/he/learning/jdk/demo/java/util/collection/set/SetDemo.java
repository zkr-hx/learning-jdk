package he.learning.jdk.demo.java.util.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

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


        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("aa");
        treeSet.add("bb");
        treeSet.add("cc");
        treeSet.add("dd");
        treeSet.subSet("aa\0", "cc").forEach(System.out::println);

    }
}
