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
            Class testClass = classLoader.loadClass("Dog");
            System.out.println(testClass.getClassLoader());//输出加载类Car的加载器
            Factorey dog = (Factorey) testClass.newInstance();//创建Car类对象，会调用构造方法
            dog.do1();
            dog.do2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //new Dog().do1();
    }
}
