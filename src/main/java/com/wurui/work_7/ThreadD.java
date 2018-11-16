package com.wurui.work_7;

public class ThreadD extends Thread{
	private Myservice myService;

	public ThreadD(Myservice myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		myService.signal();
	}

}
