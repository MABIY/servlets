package com.china.lh.servlets.test;

import java.util.Date;

/**
 * Created by lh on 16-3-31.
 */
//延迟执行代码的方法
public class ThreadDefer {
    public static void main(String[] args) {
        System.out.println("test" + new Date());
        new Thread() {
            public void run(){
                try{
                    System.out.println("inner　Thread" + new Date());
                    System.out.println("Thread name" +Thread.currentThread().getName());
                    Thread.sleep(5000);
                    System.out.println("inner　Thread" + new Date());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        System.out.println("test" + new Date());
        System.out.println("Thread name" +Thread.currentThread().getName());
    }
}
