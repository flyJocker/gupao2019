package com.gupao.edu.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

public class PromotionActivityTest {

        //一般情况下不这么写
//    public static void main(String[] args) {
//        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
//        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());
//
//        activity618.execute();
//        activity1111.execute();
//    }
        //使用工厂模式优化
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String promotionKey = "COUPON";
//
//        if(StringUtils.equals(promotionKey, "COUPON")){
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        }
//        else if(StringUtils.equals(promotionKey, "CASHBACK")){
//            promotionActivity = new PromotionActivity(new CashbackStrategy());
//        }
//        else if(StringUtils.equals(promotionKey, "GROUP")){
//            promotionActivity = new PromotionActivity(new GroupStrategy());
//        }
//        else {
//            promotionActivity = new PromotionActivity(new EmptyStrategy());
//        }
//        promotionActivity.execute();
//    }

    public static void main(String[] args) {
        String promotionKey = "GROUP";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}
