package com.liuhx.thread;

public class Main {
    Boolean running = false;

    public static void main(String[] args) {
        Lock1 lock1 = null;
        Lock2 lock2 = null;
        new Thread(lock1, "线程1").start();
        new Thread(lock2, "线程2").start();
    }

    public class Lock1 implements Runnable {
        Lock2 lock2;
        public Lock1(Lock2 lock){
            this.lock2 = lock;
        }
        @Override
        public void run() {
                synchronized (this) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            

        }
    }
    public class Lock2 implements Runnable {
        @Override
        public void run() {
                synchronized (this) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

        }
    }

}
