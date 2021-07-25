package he.learning.jdk.demo.java.util.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 禾绪
 */
public class CountLongWords {

    private CountLongWords() {
    }

    public static void main(String[] args) {
        try {
            // read file into string
//            var contents = new String(Files.readAllBytes(Paths.get("C:\\Users\\禾绪\\Desktop\\2018年考研英语（二）真题.doc")));
            // Split into words; no letters are delimiters
//            List<String> words = List.of(contents.split("\\PL+"));
            List<String> words = new ArrayList<>();

            long count = 0;
            for (String w : words) {
                if (w.length() > 12) {
                    System.out.println(w);
                    count++;
                }
            }
            System.out.println("增强For循环计算结果：count = " + count);

            count = words.stream().filter(s -> {
                if (s.length() > 12) {
                    System.out.println(s);
                    return true;
                }
                return false;
            }).count();
            System.out.println("stream计算结果：count = " + count);

            count = words.parallelStream().filter(s -> {
                if (s.length() > 12) {
                    System.out.println(s);
                    return true;
                }
                return false;
            }).count();
            System.out.println("parallelStream计算结果：count = " + count);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
