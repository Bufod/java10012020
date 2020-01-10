package com.company;

public class Main {

    public static void main(String[] args) {
        Gen<Integer, Double> nums = new Gen<>(5, 12.5);
        System.out.println(nums.add());


    }
}
