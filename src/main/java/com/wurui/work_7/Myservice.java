package com.wurui.work_7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Myservice {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void await(){
		try {
			lock.lock();
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void signal(){
		lock.lock();
		condition.signal();
		lock.unlock();
	}
}
