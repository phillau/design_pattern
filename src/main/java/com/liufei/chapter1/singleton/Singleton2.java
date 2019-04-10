package com.liufei.chapter1.singleton;

/**
 * 懒汉模式（通过synchronize修复线程问题，但是会造成频繁调用时性能低下，其实只需要第一次初始化时synchronize起了作用）
 */
public class Singleton2 {
    private static Singleton2 singleton;

    private Singleton2() {
    }

    public synchronized static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
