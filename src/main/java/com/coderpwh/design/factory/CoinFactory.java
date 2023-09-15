package com.coderpwh.design.factory;

/**
 * @author coderpwh
 * @date 2023/9/15 16:48
 */
public class CoinFactory {

    public static Coin getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}
