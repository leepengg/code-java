package com.leepengg.knapsack;

import java.util.ArrayList;

/**
 * Created by peng on 10/13/15.
 */

/**
 * 求解背包问题：
 * 给定 n个背包，其重量分别为 w1,w2,……,wn, 价值分别为 v1,v2,……,vn
 * 要放入总承重为 totalWeight 的箱子中，
 * 求可放入箱子的背包价值总和的最大值。
 * <p/>
 * NOTE: 使用动态规划法求解背包问题
 * 设前n个背包，总承重为j的最优值为 v[n,j], 最优解背包组成为 b[n];
 * 求解最优值：
 * 1. 若 j < wn, 则 ： v[n,j] = v[n-1,j];
 * 2. 若 j >= wn, 则：v[n,j] = max{v[n-1,j], vn + v[n-1,j-wn]}。
 */

class Knapsack {
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

public class KnapsackProblem {
    /**
     * 指定背包
     */
    private Knapsack[] bags;

    /**
     * 总承重
     */
    private int totalWeight;

    /**
     * 给定背包数量
     */
    private int n;

    /**
     * 前n 个背包，总承重为 totalWeight 的最优值矩阵
     */
    private int[] bestValues;

    /**
     * 前 n 个背包，总承重为 totalWeight 的最优值
     */
    private int bestValue;

    /**
     * 前 n个背包，总承重为totalWeight的最优解的物品组成
     */
    private ArrayList bestSolution;


    public KnapsackProblem(Knapsack[] bags, int totalWeight, int n) {
        this.bags = bags;
        this.totalWeight = totalWeight;
        this.n = n;
        if (bestValues == null) {
            bestValues = new int[totalWeight + 1];
        }
        if (bestSolution == null)
            bestSolution = new ArrayList();
    }

    /**
     * 求解前 n 个背包、给定总承重为 totalWeight 下的背包问题
     */
    public void solution() {

        System.out.println("给定背包：");
        for (Knapsack b : bags) {
            System.out.println(b);
        }
        System.out.println("给定总承重: " + totalWeight);


        for (int i = 0; i <= n; ++i) {
            //if(i>0)   scanf("%d %d", &V, &W);
            for (int j = totalWeight; j >= 0; --j) {
                int iweight = bags[i - 1].getWeight();
                int ivalue = bags[i - 1].getValue();
                if (j >= ivalue && i > 0) bestValues[j] = bestValues[j - ivalue] + iweight;
            }
        }


        // 求解背包组成
        /*
        int tempWeight = totalWeight;
        for (int i = n; i >= 1; i--) {
            if (bestValues[i][tempWeight] > bestValues[i - 1][tempWeight]) {
                bestSolution.add(bags[i - 1]);
                tempWeight = totalWeight - bags[i - 1].getWeight();
            }
        }
        */
    }

    /**
     * 获得前  n 个背包， 总承重为 totalWeight 的背包问题的最优解值
     * 调用条件： 必须先调用 solution 方法
     */
    public int getBestValue() {

        bestValue = bestValues[totalWeight];
        return bestValue;
    }

    /**
     * 获得前  n 个背包， 总承重为 totalWeight 的背包问题的最优解值矩阵
     * 调用条件： 必须先调用 solution 方法
     */
    public int[] getBestValues() {

        return bestValues;
    }

    /**
     * 获得前  n 个背包， 总承重为 totalWeight 的背包问题的最优解值矩阵
     * 调用条件： 必须先调用 solution 方法
     */
    public ArrayList getBestSolution() {
        return bestSolution;
    }

    public static void main(String[] args) {

        Knapsack[] bags = new Knapsack[]{
                new Knapsack(100, 100, null), new Knapsack(50, 50, null),
                new Knapsack(80, 80, null), new Knapsack(5, 5, null)
        };
        int totalWeight = 140;
        int n = bags.length;
        KnapsackProblem kp = new KnapsackProblem(bags, totalWeight, n);

        kp.solution();
        System.out.println(" -------- 该背包问题实例的解: --------- ");
        System.out.println("最优值：" + kp.getBestValue());
        System.out.println("最优解【选取的背包】: ");
        System.out.println(kp.getBestSolution());
        System.out.println("最优值矩阵：");
        int[] bestValues = kp.getBestValues();
        for (int i = 0; i < bestValues.length; i++) {
            System.out.printf("%-5d", bestValues[i]);
        }
        System.out.println();
    }

}
