package WrittenExam.Ziroom.ABCABC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 用三个线程按顺序循环打印 abc 三个字母，比如 abcabcabc
 * <p>
 * 思路就是我们三个线程用同一把锁，刚开始，a线程获取锁，打印a，设置下一个打印b，并同时唤醒bc，这时候，bc线程都阻塞等待，如果c抢到了锁，进入代码执行，由于不符合条件，会wait（同时释放锁），直到b抢到锁，符合条件打印，如此，顺序执行下去。
 *
 * @author Zhang Yupeng
 * @since 2020/4/16
 */
public class AbcAbcOut {

    //定义一个锁
    static final Object syn = new Object();
    //定义输出
    public static String next = "A";

    public static void main(String[] args) {
        new AbcAbcOut().print();
    }

    private void print() {
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(new AThread());
        service.execute(new BThread());
        service.execute(new CThread());
    }

    static class AThread implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (syn) {
                    //线程A里面只管输出A
                    while (!"A".equals(next)) {
                        try {
                            syn.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("A");
                    next = "B";
                    syn.notifyAll();
                }
            }
        }
    }

    static class BThread implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (syn) {
                    while (!"B".equals(next)) {
                        try {
                            syn.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("B");
                    next = "C";
                    syn.notifyAll();
                }
            }
        }
    }

    static class CThread implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (syn) {
                    while (!"C".equals(next)) {
                        try {
                            syn.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("C");
                    next = "A";
                    syn.notifyAll();
                }
            }
        }
    }
}