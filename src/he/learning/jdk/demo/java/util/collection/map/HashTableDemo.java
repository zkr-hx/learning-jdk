package he.learning.jdk.demo.java.util.collection.map;

import java.util.Hashtable;

/**
 * @author 朱科睿
 */
public class HashTableDemo {

    public HashTableDemo() {
        return;
    }

    public static void main(String[] args) {
        Hashtable<String, Integer> numbers = new Hashtable<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("a", 3);
        numbers.forEach((s, integer) -> System.out.println(s + "---" + integer));
    }

}
