package com.coderpwh.design.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * @author coderpwh
 * @date 2023/9/15 16:39
 */
@Getter
@RequiredArgsConstructor
public enum CoinType {

    COPPER(CopperCoin::new),

    GOLD(GoldCoin::new);

    private final Supplier<Coin> constructor;


}
