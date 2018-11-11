package com.wurui.work_5;

public class Main {
	public static void main(String[] args) {
		/*
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
		*/
		
		/*
		Object obj = new Object();
		WaitA wa = new WaitA(obj);
		WaitB wb = new WaitB(obj);
		wa.start();
		wb.start();
		
//		try {
////			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		synchronized (obj) {
			obj.notify();
//			obj.notifyAll();
		}
		
		*/
		String lock = new String("");
		P p = new P(lock);
		C c = new C(lock);
		
		ThreadP[] pThread = new ThreadP[2];
		ThreadC[] cThread = new ThreadC[2];
		
		for(int i=0;i<2;i++){
			pThread[i] = new ThreadP(p);
			pThread[i].setName("生产者" + (i + 1));
			
			cThread[i] = new ThreadC(c);
			cThread[i].setName("消费者" + (i+1));
			
			pThread[i].start();
			cThread[i].start();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for(int i=0;i<threadArray.length; i++){
			System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
		}
		
	}
}
