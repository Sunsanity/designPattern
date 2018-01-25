package deadLock;

/**
 * 1.synchronized方式死锁
 * 线程thread1先获取锁locka，然后在同步块里嵌套竞争锁lockb。而线程thread2先获取锁lockb，然后在同步块里嵌套竞争锁locka
 * （此时已经locka被线程thread1拥有，而thread1在等待lockb，而lockb被thread2拥有，thread2在等待locka……无线循环）。
 *
 * 2.Lock方式死锁
 * lock方式死锁的原因只可能是没有正确调用lock.unlock()或者根本没有调用unlock方法
 * 正确做法应该是在finally中调用unlock(),
 * 如果在catch中调用unlock的话，加入程序抛出一个Throwable而不是Exception，这时不走catch代码，会导致unlock方法不会被调用，以致死锁发生
 * Created by hasee on 2018/1/25.
 */
public class SyncDeadLock {

    //locka
    private static Object locka = new Object();
    //lockb
    private static Object lockb = new Object();

    //测试synchronized死锁
    public static void main(String[] args) {
        new SyncDeadLock().deadLock();
    }


    private void deadLock(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (locka){
                    try {
                        System.out.println(Thread.currentThread().getName() + " get locka ing");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " after sleep 500ms");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " need lockb, get lockb ing");
                    synchronized (lockb){
                        System.out.println(Thread.currentThread().getName() + " get lockb ing");
                    }
                }
            }
        },"thread1");

                    Thread thread2 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            synchronized (lockb){
                    try {
                        System.out.println(Thread.currentThread().getName() + " get lockb ing");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " after sleep 500ms");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " need locka, get locka ing");
                    synchronized (locka){
                        System.out.println(Thread.currentThread().getName() + " get locka ing");
                    }
                }
            }
        },"thread2");

        thread1.start();
        thread2.start();
    }

}
