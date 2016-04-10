package com.china.lh.servlets.test;

/**
 * Created by lh on 16-4-10.
 */
public class Escape {
    public static void main(String[] args) {
        String sName = "Java转义字符(补遗)";

        // reference  http://www.runoob.com/java/java-regular-expressions.html
        sName = sName.replaceFirst("\\(补遗\\)","");
        System.out.println(sName);
        System.out.println(sName);
    }
}
