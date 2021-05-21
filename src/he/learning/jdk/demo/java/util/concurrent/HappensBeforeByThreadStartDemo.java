package he.learning.jdk.demo.java.util.concurrent;

/**
 * A call to start on a thread happens-before any action in the started thread.
 *
 * @author 朱科睿
 */
public class HappensBeforeByThreadStartDemo {

    static int a = 1;

    public static void main(String[] args){
        Thread tb = new Thread(() -> System.out.println(a));
        Thread ta = new Thread(() -> {
            tb.start();
            a = 3;
        });

        ta.start();
    }
}
