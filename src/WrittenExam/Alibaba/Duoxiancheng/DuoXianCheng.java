package WrittenExam.Alibaba.Duoxiancheng;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 有A、B两个线程，A线程只能往文件中输出1，B线程只能往文件中输出2，编写一个程序使得输出文件内容为121212...
 *
 * @author Zhang Yupeng
 * @since 2020/4/26
 */
public class DuoXianCheng {

    //定义一个锁
    static final Object syn = new Object();
    //定义输出
    public static String next = "1";

    public static void main(String[] args) {
        new DuoXianCheng().print();
    }

    private void print() {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new Thread1());
        service.execute(new Thread2());
    }

    static class Thread1 implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (syn) {
                    while (!"1".equals(next)) {
                        try {
                            syn.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("1");
                    next = "2";
                    syn.notifyAll();
                }
            }
        }
    }

    static class Thread2 implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (syn) {
                    while (!"2".equals(next)) {
                        try {
                            syn.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("2");
                    next = "1";
                    syn.notifyAll();
                }
            }
        }
    }
}