package com.coderpwh.design.singleton;

/**
 * @author coderpwh
 * @date 2023/9/15 11:20
 */
public class InitializingOnDemandHolderIdiom {


    /***
     * 私有化构造
     */
    private InitializingOnDemandHolderIdiom() {

    }


    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.instance;
    }

    public static class HelperHolder {
        private static final InitializingOnDemandHolderIdiom instance = new InitializingOnDemandHolderIdiom();
    }

}
