package com.ac.enumtest;

/**
 * Description:
 * <p>
 * Created by aochong on 2019/9/23
 *
 * @author aochong
 * @version 1.0
 */
public enum Operator {
    // 加
    PLUS("+") { // 枚举对象必须覆写抽象方法
        @Override
        public double applyOp(double x, double y) {
            System.out.println("做加法");
            return x + y;
        }
    },
    // 减
    MINUS("-") {
        @Override
        public double applyOp(double x, double y) {
            System.out.println("做减法");
            return x - y;
        }
    },
    // 乘
    TIMES("*") {
        @Override
        public double applyOp(double x, double y) {
            System.out.println("做乘法");
            return x * y;
        }
    },
    // 除
    DIVIDE("/") {
        @Override
        public double applyOp(double x, double y) {
            System.out.println("做除法");
            return x / y;
        }
    },
    // 取模
    MOD("%") {
        @Override
        public double applyOp(double x, double y) {
            System.out.println("做取模");
            return x % y;
        }
    };

    private String symbol;

    private Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    /**
     * 枚举类中可以定义抽象方法
     * 模拟计算器
     * @param x     运算数
     * @param y     运算数
     * @return  结果
     */
    public abstract double applyOp(double x, double y);
}
