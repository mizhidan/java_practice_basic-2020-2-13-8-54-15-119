package com.thoughtworks.Discount;

public class HalfItemDiscount extends Discount implements promotion  {

    private int discountPrice;

    public HalfItemDiscount() {
        super(discountPrice,discountItem);
    }

    @Override
    public String getDiscountMoney() {
        return null;
    }

    @Override
    public String getDiscountInfo() {
        return null;
    }
}
