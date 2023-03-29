package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SoftDrink implements InitializingBean , DisposableBean {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SoftDrink(){
        super();
    }



    @Override
    public String toString() {
        return "SoftDrink{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Taking SoftDrink From Fridge...");
    }

    public void destroy () throws Exception{
        System.out.println("Putting back to Fridge...");
    }
}
