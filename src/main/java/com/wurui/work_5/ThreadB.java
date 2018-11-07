package com.wurui.work_5;

public class ThreadB extends Thread {
	private MyList myList;
	private Object obj;
	
	public ThreadB(MyList myList,Object obj){
		this.myList = myList;
		this.obj = obj;
	}
	
	@Override
	public void run() {
		/*
		try {
			while(true){
				int size = myList.getSize();
				if(size == 5){
					System.out.println("5个元素了,我要退出了!");
					throw new InterruptedException();
				}
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		if (myList.getSize() != 5) {
			System.out.println("不等于5,准备wait");
			try {
				synchronized (obj) {
					System.out.println("不等于5,成功wait");
					obj.wait();
					System.out.println("被唤醒");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("5个元素了!我要退出!");

	}
}
