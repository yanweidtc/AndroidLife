package com.camnter.newlife.utils.other;

/**
 * Description：Singleton
 * Created by：CaMnter
 * Time：2016-02-27 22:07
 */
public class Singleton {

    private volatile static Singleton instance = null;


    private Singleton() {
    }


    public static Singleton getInstance() {
        Singleton inst = instance;  // <<< 在这里创建临时变量
        if (inst == null) {
            synchronized (Singleton.class) {
                inst = instance;
                if (inst == null) {
                    inst = new Singleton();
                    instance = inst;
                }
            }
        }
        return inst;  // <<< 注意这里返回的是临时变量
    }

}
