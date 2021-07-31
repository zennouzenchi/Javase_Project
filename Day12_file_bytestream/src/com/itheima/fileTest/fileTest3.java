package com.itheima.fileTest;

import java.io.File;

public class fileTest3 {
    public static void main(String[] args) {
        File src = new File("Day12_file_bytestream\\");
        deleteDir(src);
    }

    private static void deleteDir(File src) {
        //进入src文件夹,得到所有内容的file对象
        File[] files = src.listFiles();
        //遍历files得到文件夹下每一个file对象
        for (File file : files) {
            //如果是文件，直接删除
            if (file.isFile()){
                file.delete();
            }else {
                //如果是文件夹,直接递归
                deleteDir(file);
            }
            //当文件夹内部所有内容删除后,删除自己
        }src.delete();
    }
}
