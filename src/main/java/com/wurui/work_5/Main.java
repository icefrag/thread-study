package com.wurui.work_5;

public class Main {
	public static void main(String[] args) {
		// A线程add5个元素后,通知b线程退出.
		MyList list = new MyList();
		Object obj = new Object();
		ThreadA a = new ThreadA(list,obj);
		ThreadB b = new ThreadB(list,obj);
		b.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.start();
		
	}
}
