package com.itheima.fileTest;

public class stringBuilderTest {
    public static void main(String[] args) {
        System.out.println("filetest");
        //字符串String 特点，一旦创建不能改变
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        //常量拼接底层存在自动优化的特点
        String s4 = s1+s2+s3;
        //"ab"+"c"+"abc"会产生用不到的中间字符串
        //如果字符串拼接次数多，不能使用String
        //StringBuilder改良:
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2).append(s3);
        //底层为字符数组,最终可以一次性toString
        //可以减少中间字符串的产生
        String newStr = sb.toString();
    }
}
