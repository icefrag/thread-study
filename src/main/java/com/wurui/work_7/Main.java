package com.wurui.work_7;

public class Main {
	public static void main(String[] args) {
		
		/**
		 * 验证sleep锁不释放. lock达到synch一样的效果.
		 */
		/*
		Task t = new Task();
		
		ThreadA t1 = new ThreadA(t);
		ThreadB t2 = new ThreadB(t);
		
		t1.start();
		t2.start();
		*/
		
		Myservice service = new Myservice();
		ThreadC tc = new ThreadC(service);
		ThreadD td = new ThreadD(service);
		tc.start();
		td.start();
		
	}
}
