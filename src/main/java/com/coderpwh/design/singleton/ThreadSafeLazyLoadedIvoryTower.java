package com.coderpwh.design.singleton;

/**
 * @author coderpwh
 * @date 2023/9/15 11:41
 */
public class ThreadSafeLazyLoadedIvoryTower {


    private static volatile ThreadSafeLazyLoadedIvoryTower instance;


    /***
     * 私有构造函数
     */
    private ThreadSafeLazyLoadedIvoryTower() {

    }


    /***
     * 饿汉式
     * @return
     */
    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }
        return instance;
    }


}
