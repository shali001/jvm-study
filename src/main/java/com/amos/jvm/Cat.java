package com.amos.jvm;

/**
 * @ClassName : Cat
 * @Description :
 * @Author : mlb
 * @Date: 2020-08-12 14:09
 */
public class Cat implements Factorey{


    @Override
    public void do1() {
        System.out.println("cat...1..........");
    }

    @Override
    public void do2() {
        System.out.println("cat...2..........");
    }
}
