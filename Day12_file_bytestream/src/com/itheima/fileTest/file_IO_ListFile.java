package com.itheima.fileTest;

import java.io.File;

public class file_IO_ListFile {
    public static void main(String[] args) {
        //获取文件夹下所有子文件和文件夹
        //包括设置隐藏的文件和文件夹
        //获取这个文件夹下的所有文件和文件夹的file对象，放在数组中返回
        File file = new File("D:\\");
        File[] files = file.listFiles();
        for (File path : files) {
            System.out.println(path);
        }
        /**注意事项:
         * 1.当调用者是一个文件时 返回null
         * 2.当调用者是一个空文件夹时 会返回长度为0的数组
         * 3.当调用者是一个有内容的文件时 会把文件路径装进数组中返回
         * 4.当调用这是一个有权限才能进的文件夹时 返回null
         * 总结：调用者是一个文件、路径不存在、没有权限都返回null。
        */
    }

}
