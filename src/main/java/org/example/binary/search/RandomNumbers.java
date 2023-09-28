package org.example;

public class RandomNumbers {
    Integer intNum;
    public Integer rollNumb(){
        double num = Math.random()*100;
        this.intNum = (int)num;
        return this.intNum;
    }



}
