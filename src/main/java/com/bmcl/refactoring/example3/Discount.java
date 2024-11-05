package com.bmcl.refactoring.example3;

public abstract class Discount {
    private final int fixed;
    private final double percentage;

    public Discount(int fixed) {
        this.fixed = fixed;
        this.percentage = 0;
    }

    public Discount(double percentage) {
        this.percentage = percentage;
        this.fixed = 0;
    }

    public double applyDiscount(double price) {
        double discountedPrice = price;

        if (fixed != 0) discountedPrice = price - fixed;
        else discountedPrice = price - price * percentage;

        return discountedPrice;
    }
}
