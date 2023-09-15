package com.coderpwh.design.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author coderpwh
 * @date 2023/9/15 14:49
 */
@Slf4j
public class App {

    private static final String RED_DRAGON_EMERGES = "Red dragon emerges.";
    private static final String GREEN_DRAGON_SPOTTED = "Green dragon spotted ahead!";
    private static final String BLACK_DRAGON_LANDS = "Black dragon lands before you.";

    public static void main(String[] args) {

        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        log.info(RED_DRAGON_EMERGES);

        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        log.info(BLACK_DRAGON_LANDS);

        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        log.info(GREEN_DRAGON_SPOTTED);

        log.info("-----------------------------------------------------------------");
        dragonSlayer = new DragonSlayer(() -> log.info("java8-functional"));
        dragonSlayer.goToBattle();
        log.info(RED_DRAGON_EMERGES);

        dragonSlayer.changeStrategy(() -> log.info("java8-functional--changeStrategy"));
        dragonSlayer.goToBattle();
        log.info(BLACK_DRAGON_LANDS);

        dragonSlayer.changeStrategy(() -> {
            log.info("java8-function--changeStrategy");
        });
        dragonSlayer.goToBattle();
        log.info("-----------------------------------------------------------------");

        log.info(GREEN_DRAGON_SPOTTED);
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.MeleeStrategy);
        dragonSlayer.goToBattle();
        log.info(RED_DRAGON_EMERGES);

        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.ProjectileStrategy);
        dragonSlayer.goToBattle();
        log.info(BLACK_DRAGON_LANDS);

        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.SpellStrategy);
        dragonSlayer.goToBattle();


    }

}
