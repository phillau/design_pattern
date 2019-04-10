package com.liufei.chapter1.singleton;

/**
 * https://blog.csdn.net/a_842297171/article/details/79316591
 * 懒汉模式，双重检查，无线程问题，性能得到了提升（注意要加volatile，避免指令重排序可能造成的空指针问题）
 */
public class Singleton3 {
    private volatile static Singleton3 singleton;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
