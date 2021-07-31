package com.itheima.fileTest;

import java.io.File;
import java.io.IOException;

public class file_IO_Test1 {
    public static void main(String[] args) throws IOException {
        File f2 = new File("D:\\aa\\bb\\cc.txt");
//        f2.createNewFile();
        //当创建文件时，指定文件夹未创建时，程序会报错.
        //需要先创建文件夹:
        File dir1 = new File("D:\\aa");
        //当创建的文件夹只有一级的时候调用mkdir方法创建单级文件夹
        dir1.mkdir();
        File dir2 = new File("D:\\aa\\bb");
        //当多级文件夹创建时需要调用mkdirs来创建
        dir2.mkdirs();
        //总结：无论创建几级文件夹,都可以调用mkdirs方法
        f2.createNewFile();
        //创建文件夹之后再创建文件就不会报错了
        File f1 = new File("D:\\aa\\bb\\cc.txt");
        System.out.println(f1.delete());
        //当指定文件夹中有其他内容时，调用delete方法会失败
        //测试此抽象路径名表示的File是否为文件夹（目录）
        System.out.println(f1.isDirectory());
        //测试此抽象路径名表示的File是否为文件
        System.out.println(f1.isFile());
        //测试此抽象路径名表示的File是否为存在
        File file = new File("a.txt");
        System.out.println(file.exists());
        //返回由此抽象路径名表示的文件或目录名称
        //如果调用的时是文件夹，获取的是文件夹名字
        //如果调用的是文件，则获取的是文件名
        System.out.println(f1.getName());
    }
}
