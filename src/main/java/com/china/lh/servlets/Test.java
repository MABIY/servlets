package com.china.lh.servlets;

/**
 * Created by lh on 16-3-27.
 */
public class Test extends SuperTest {
     String superName;
    public Test(){
        this("lh");
        System.out.println(superName+"Test");
    }

    public Test(String name){
        super(name);
        this.superName = name+"lh";
        System.out.println(superName+"Test(String name)");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.print();
        System.out.println(test.superName);
    }


}
