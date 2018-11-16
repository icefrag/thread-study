package com.wurui.work_7;

public class ThreadC extends Thread{
	private Myservice myservice;

	public ThreadC(Myservice myservice) {
		super();
		this.myservice = myservice;
	}
	
	@Override
	public void run() {
		myservice.await();
	}
}
