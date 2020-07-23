package com.amos.jvm;

/**
 * @ClassName : ClassLoadDemo
 * @Description :
 * @Author : mlb
 * @Date: 2020-07-23 16:23
 */
public class ClassLoadDemo {
    public static void main(String[] args) {
       /* ClassLoader classLoader = ClassLoadDemo.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());*/

        MyClassLoader classLoader = new MyClassLoader();
        try {
            Class testClass = classLoader.loadClass("com.amos.jvm.Test");
            Object object = testClass.getClassLoader();
            System.out.println(object.getClass().getClassLoader());
            Class.forName("Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
