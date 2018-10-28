1.如何创建线程
	1. 继承thread
	2. new Runnable
	3. CallAble(多线程获取返回值)
2.如何启动线程
	t.start();
3.如何暂停
4.线程的优先级

synchronized 修饰非静态方法 对象锁
synchronized 修饰静态方法类锁
重点:分清对象锁和类锁
volatile
1.保证线程之间数据的可见性
2.用于停止线程,用作全局开关

sleep 线程进入睡眠,但是不会释放已经获得的锁.
yield 放弃当前的cpu资源.

isInterrupted() Thread中的非静态方法.判断线程是否是打断状态,且不会清除打断状态.
interrupted() Thread中的静态方法,测试当前线程是否打断. interrupted 会清除打断状态
如果在runnable中使用.两个方法都可以正确获取当前线程的打断状态.
如果在sleep状态被打断,则catch中获取打断状态是false的.

suspend() 暂停线程不释放锁
resume() 恢复线程
线程的优先级 1-10  最低1 最高10 正常值5
A线程启动了B线程,则B线程与A线程有相同的优先级.
线程的优先级具有随机性,并不是绝对的.

Thread.interrupted()
    public static boolean interrupted() {
        return currentThread().isInterrupted(true);
    }
Thread.isInterrupted()
    public boolean isInterrupted() {
        return isInterrupted(false);
    }


常用api:
Thread.currentThread() //获取当前线程
Thread.currentThread().getName() //获取线程的名字





