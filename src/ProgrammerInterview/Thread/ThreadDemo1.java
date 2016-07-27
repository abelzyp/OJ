package ProgrammerInterview.Thread;

/*
 * 设计4个线程，其中两个线程每次对j增加1，另两个线程每次对j减少1。循环100次。
 */
public class ThreadDemo1 {
	private int j;

	public static void main(String[] args) {
		ThreadDemo1 td = new ThreadDemo1();
		Inc inc = td.new Inc();
		Dec dec = td.new Dec();
		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(inc);
			t.start();
			t = new Thread(dec);
			t.start();
		}
	}

	private synchronized void inc() {
		j++;
		System.out.println(Thread.currentThread().getName() + "-inc:" + j);
	}

	private synchronized void dec() {
		j--;
		System.out.println(Thread.currentThread().getName() + "-dec:" + j);
	}

	class Inc implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				inc();
			}
		}
	}

	class Dec implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				dec();
			}
		}
	}
}
