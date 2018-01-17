package com.COR;

/**
 * 价格处理人，负责处理客户折扣申请，抽象的父类处理器
 * Created by hasee on 2018/1/17.
 */
public abstract class PriceHandler {

    /*
	 * 直接后继，用于传递请求
	 */
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /*
	 * 处理折扣申请
	 */
    public abstract  void processDiscount(float discount);
}
