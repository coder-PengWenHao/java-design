package com.coderpwh.design.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author coderpwh
 * @date 2023/9/15 15:19
 */
@Slf4j
public class ProjectileStrategy implements DragonSlayingStrategy {


    @Override
    public void execute() {
        log.info("This is ProjectileStrategy");
    }

}
