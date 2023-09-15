package com.coderpwh.design.singleton;

/**
 * @author coderpwh
 * @date 2023/9/15 13:48
 */
public class ThreadSafeDoubleCheckLocking {

    private static volatile ThreadSafeDoubleCheckLocking instance;

    /***
     *  私有构造函数
     */
    private ThreadSafeDoubleCheckLocking() {

    }


    public static ThreadSafeDoubleCheckLocking getInstance() {
        ThreadSafeDoubleCheckLocking result = instance;

        if (result == null) {
            synchronized (ThreadSafeDoubleCheckLocking.class) {
                result = instance;
                if (result == null) {
                    result = new ThreadSafeDoubleCheckLocking();
                    instance = result;
                }
            }
        }
        return result;
    }


}
