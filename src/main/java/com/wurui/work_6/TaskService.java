package com.wurui.work_6;

public class TaskService implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			Tools.t1.set(Thread.currentThread().getId() + "," + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("" + Thread.currentThread().getId() + Tools.t1.get());
			
		}
	}
	
}
