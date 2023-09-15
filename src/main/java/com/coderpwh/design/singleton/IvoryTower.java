package com.coderpwh.design.singleton;

/**
 * @author coderpwh
 * @date 2023/9/15 11:35
 */
public class IvoryTower {

    private IvoryTower() {

    }

    private static final IvoryTower INSTANCE = new IvoryTower();


    public static IvoryTower getInstance() {
        return INSTANCE;
    }

}
