package com.coderpwh.design.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author coderpwh
 * @date 2023/9/15 16:21
 */
@Slf4j
public class GoldCoin implements Coin {

    @Override
    public void getDescription() {
        log.info("this is goldCoid");
    }

}
