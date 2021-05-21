package he.learning.jdk.demo.java.util.concurrent;

/**
 * All actions in a thread happen-before any other thread successfully returns from a join on that thread.
 *
 * @author 朱科睿
 */
public class HappensBeforeByThreadJoinDemo {

    static int a = 1;

    public static void main(String[] args){
        Thread tb = new Thread(() -> a = 2);
        Thread ta = new Thread(() -> {
            try {
                tb.join();
            } catch (InterruptedException e) {
                //NO
            }
            System.out.println(a);
        });

        ta.start();
        tb.start();
    }
}
