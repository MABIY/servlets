package com.china.lh.servlets.test;

/**
 * Created by lh on 16-4-10.
 */
public class Escape {
    public static void main(String[] args) {
        String sName = "Java转义字符(补遗)";

        // reference  http://www.runoob.com/java/java-regular-expressions.html
        //文字替换
        sName = sName.replace("(","");
        //正正则表达式替换
        sName = sName.replaceFirst("\\(","");
        System.out.println(sName);
        System.out.println(sName);
    }
}
