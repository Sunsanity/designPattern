package com.COR.cli;

import com.COR.PriceHandler;
import com.COR.PriceHandlerFactory;

import java.util.Random;

/**
 * Created by hasee on 2018/1/17.
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }


    /**
     * 测试责任链方法
     * @param args
     */
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random rand = new Random();

        for(int i=1;i<=100;i++){
            System.out.print(i+":");
            customer.requestDiscount(rand.nextFloat());
        }
    }
}
