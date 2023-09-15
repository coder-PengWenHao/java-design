package com.coderpwh.design.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author coderpwh
 * @date 2023/9/15 15:32
 */
@Slf4j
public class LambdaStrategy {


    public enum Strategy implements DragonSlayingStrategy {

        MeleeStrategy(() -> {
            log.info("This is LambdaStrategy->MeleeStrategy");
        }),

        ProjectileStrategy(() -> {
            log.info("This is LambdaStrategy->ProjectileStrategy");
        }),

        SpellStrategy(() -> {
            log.info("This is LambdaStrategy->SpellStrategy");
        });


        private final DragonSlayingStrategy dragonSlayingStrategy;

        Strategy(DragonSlayingStrategy dragonSlayingStrategy) {
            this.dragonSlayingStrategy = dragonSlayingStrategy;
        }

        @Override
        public void execute() {
            dragonSlayingStrategy.execute();
        }

    }
}
