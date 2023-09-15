package com.coderpwh.design.singleton;

/**
 * @author coderpwh
 * @date 2023/9/15 11:27
 */
public enum EnumIvoryTower {


    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }

}
