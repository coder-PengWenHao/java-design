package com.coderpwh.design.strategy;

/**
 * @author coderpwh
 * @date 2023/9/15 15:22
 */
public class DragonSlayer {

    private DragonSlayingStrategy strategy;


    /***
     * 构造
     * @param strategy
     */
    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }


    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }


    public void goToBattle() {
        strategy.execute();
    }

}
