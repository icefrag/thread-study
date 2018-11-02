package com.seikinoko.classlock;

import java.util.concurrent.TimeUnit;

public class Task {

	public void method(String name) {
		System.out.println("任务" + name + "：进入方法，等待Task类锁");
		synchronized (Task.class) {
			System.out.println("任务" + name + "：已获取到Task类锁，执行方法");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("任务" + name + "：方法执行完成");
		}
	}
}
