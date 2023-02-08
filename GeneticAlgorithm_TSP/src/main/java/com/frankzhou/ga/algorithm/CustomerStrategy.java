package com.frankzhou.ga.algorithm;

/**
 * @author This.FrankZhou
 * @version 1.0
 * @description
 * @date 2023-02-08
 */
public abstract class CustomerStrategy {

    public static double dis(Customer a,Customer b)
    {
        return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));//返回两个顾客的欧式距离
    }
}
