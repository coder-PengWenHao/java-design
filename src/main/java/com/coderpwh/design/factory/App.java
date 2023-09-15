package com.coderpwh.design.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author coderpwh
 * @date 2023/9/15 16:19
 */
@Slf4j
public class App {

    public static void main(String[] args) {

        log.info("start");
        Coin coinOne = CoinFactory.getCoin(CoinType.COPPER);
        Coin coinTwo = CoinFactory.getCoin(CoinType.GOLD);
        coinOne.getDescription();
        coinTwo.getDescription();
        log.info("end");
    }

}
