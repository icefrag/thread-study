package com.wurui.work_7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task{
	private Lock lock = new ReentrantLock();
	public void m1(){
		lock.lock();
		System.out.println(Thread.currentThread().getName() + "进入方法A");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "离开方法A");
		lock.unlock();
	}
	
	public void m2(){
		lock.lock();
		System.out.println(Thread.currentThread().getName() + "进入方法B");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "离开方法B");
		lock.unlock();
	}
}
