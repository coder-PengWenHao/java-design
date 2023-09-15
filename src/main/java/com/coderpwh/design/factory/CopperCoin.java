package com.coderpwh.design.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author coderpwh
 * @date 2023/9/15 16:22
 */
@Slf4j
public class CopperCoin implements Coin {

    @Override
    public void getDescription() {
        log.info("this is copperCoin");
    }

}
