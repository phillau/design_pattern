package com.liufei.chapter1.singleton;

/**
 * 内部类方式，和饿汉式有点类似，只不过是懒加载，更好
 */
public class Singleton4 {

    private Singleton4() {
    }

    private static class InnerSingleton4 {
        private static final Singleton4 singleton = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return InnerSingleton4.singleton;
    }

}
