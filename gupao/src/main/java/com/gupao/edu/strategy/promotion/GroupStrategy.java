package com.gupao.edu.strategy.promotion;

public class GroupStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全条享受团购价");
    }
}
