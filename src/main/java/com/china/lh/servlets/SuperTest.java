package com.china.lh.servlets;

/**
 * Created by lh on 16-3-27.
 */
public class SuperTest {
     String superName;
    SuperTest() {
        System.out.println("无参数");
    }
    SuperTest(String superName) {
        this.superName =superName;
        System.out.println(superName +"SuperTest");
    }
    public void print() {
        System.out.println("11"+this.superName);
    }

}
