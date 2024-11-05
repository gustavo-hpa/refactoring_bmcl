package com.bmcl.refactoring.example1;

public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        double total = product.getPrice() * quantity;
        return total;
    }

    @Override
    public String toString(){
        return (product.getName() + "(x" + quantity + "): " + (getTotal()));
    }
}
