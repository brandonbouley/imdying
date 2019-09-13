package com.company;

import javax.management.QueryEval;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //double x = Math.random()*10;//random number [0,1)
        //int x= (int) (Math.random()*10+10);
        //(int)(Math.random()*a+b)  // a amount of numbers starting at b



        int z= (int) (Math.random()*11);
        int die= (int) (Math.random()*6+1);
        int coin= (int) (Math.random()*2);
        int die2= (int) (Math.random()*6+1) + (int) (Math.random()*6+1);
        int y= (int) (Math.random()*36+65);
        double x= (Math.random()*9+1);

        System.out.println(z);
        System.out.println(die);
        System.out.println(coin);
        System.out.println(die2);
        System.out.println(y);
        System.out.println(x);







    }
}
