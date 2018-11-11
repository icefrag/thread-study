package com.wurui.work_5;

public class C {
	private String lock;
	
	public C(String lock){
		this.lock = lock;
	}
	
	public void getValue(){
		try {
			synchronized (lock) {
				while(ValueObject.value.equals("")){
					System.out.println("消费者	" +Thread.currentThread().getName() + "WAITING了☆");
					lock.wait();
				}
				
				System.out.println("消费者	"+Thread.currentThread().getName() + "RUNNABLE了");
				ValueObject.value = "";
				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
