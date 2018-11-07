package com.wurui.work_5;

public class ThreadA extends Thread {
	private MyList myList;
	private Object obj;
	
	public ThreadA(MyList myList,Object obj){
		this.myList = myList;
		this.obj = obj;
	}
	
	@Override
	public void run() {
			for(int i=0;i<10;i++){
				myList.add();
				System.out.println("添加了:" + (i+1) + "个元素");
				if(myList.getSize() == 5){
						System.out.println("发出通知");
						synchronized (obj) {
							obj.notify();
						}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
