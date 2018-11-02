package com.wurui.work_4;

import java.util.concurrent.atomic.AtomicInteger;

public class Task implements Runnable{
	public AtomicInteger a = new AtomicInteger(0);
	@Override
	public void run() {
//		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + "----->" + a.addAndGet(100));
			a.addAndGet(1);			
//		}
	}
}
