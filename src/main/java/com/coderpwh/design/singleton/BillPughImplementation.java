package com.coderpwh.design.singleton;

/**
 * 内部类
 *
 * @author coderpwh
 * @date 2023/9/15 11:15
 */
public class BillPughImplementation {


    /***
     * 私有化
     */
    private BillPughImplementation() {

    }


    public static class InstanceHolder {
        private static BillPughImplementation instance = new BillPughImplementation();
    }

    public static BillPughImplementation getInstance() {
        return InstanceHolder.instance;
    }


}
