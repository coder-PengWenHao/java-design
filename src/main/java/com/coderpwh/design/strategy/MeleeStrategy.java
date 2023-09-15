package com.coderpwh.design.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author coderpwh
 * @date 2023/9/15 15:21
 */
@Slf4j
public class MeleeStrategy implements DragonSlayingStrategy {


    @Override
    public void execute() {
        log.info("this is MeleeStrategy");
    }

}
