package com.company;

public class Gen<T1 extends Number,
        T2 extends Number> {
    private T1 num1;
    private T2 num2;
    Gen(T1 num1, T2 num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    double add(){
        return num1.doubleValue() + num2.doubleValue();
    }

}
