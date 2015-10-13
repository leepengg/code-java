package com.leepengg;

/**
 * Created by peng on 10/13/15.
 */
public class Knapsack {
    /**
     * 背包重量
     */
    private int weight;

    /**
     * 背包物品价值
     */
    private int value;

    private Object object;

    /**
     * 构造器
     */
    public Knapsack(int weight, int value, Object object) {
        this.value = value;
        this.weight = weight;
        this.object = object;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "[weight: " + weight + " " + "value: " + value + "]";
    }
}
