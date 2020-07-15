import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 21:50
 * @Description:
 */
class GirlFriend {
    static int i = 1;


    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                reentrantLock.lock();
                try {
                    while (i <= 100) {
                        String name = Thread.currentThread().getName();
                        System.out.println(name + "创建第" + i++ + "个女朋友");
                        notify();
                  
                    }
                }  finally {
                    reentrantLock.unlock();
                }
            }
        };
        new Thread(runnable, "A工厂").start();
        new Thread(runnable, "B工厂").start();
        new Thread(runnable, "C工厂").start();
        new Thread(runnable, "D工厂").start();

    }


}
