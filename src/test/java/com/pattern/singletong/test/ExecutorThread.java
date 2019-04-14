package com.pattern.singletong.test;

import com.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.pattern.singleton.lazy.LazySimpleSingleton;

// 用两个线程演示多线程的执行过程
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
