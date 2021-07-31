package com.itheima.fileTest;

import java.io.File;
import java.io.IOException;

public class file_IO_SteamTest {
    public static void main(String[] args) throws IOException {
        //IO就可以对硬盘中的文件进行读写
        //file告诉虚拟机读写的文件在那个位置
        //file他是文件和目录路径的抽象表示
        //通过将给定的路径名字字符串转换为抽象路径名来创建新的File示例
        String path = "E:\\Javase_Project\\Day12_file_bytestream\\这是绝对路径下创建的.txt";
        File file = new File(path);
        //从父路径名字符串和子路径字符串创建;
        String path1 = "E:\\Javase_Project\\Day12_file_bytestream";
        File file2 = new File(path1,path);
        //从父抽象路径和子路径
        File file1 = new File("E:\\Javase_Project\\Day12_file_bytestream"+path);
        //绝对路径，指不会发生变化的从盘符开始索引的路径。例如：
        File file3 = new File("E:\\Javase_Project\\Day12_file_bytestream\\a.txt");
        //相对路径，当前项目下指定模块的路径，例如：
        //相对路径无法指定项目路径外的资源,只能使用绝对路径
        File file5 = new File("a.txt");
        File file4 = new File("Day12_file_bytestream\\src\\com\\itheima\\这是相对路径下创建的.txt");
        //createNewFile方法需要抛出异常 创建File对象的具体文件,返回值为布尔（是否创建成功
        System.out.println(file.createNewFile());
        System.out.println(file4.createNewFile());


    }
}
