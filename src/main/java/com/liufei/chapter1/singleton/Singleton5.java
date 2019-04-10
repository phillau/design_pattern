package com.liufei.chapter1.singleton;


/**
 * 枚举方式，还可以避免反射攻击和序列化问题
 */
public enum  Singleton5 {
    INSTANCE;

    public static Singleton5 getInstance(){
        return INSTANCE;
    }
}
