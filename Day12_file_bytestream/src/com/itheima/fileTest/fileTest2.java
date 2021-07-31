package com.itheima.fileTest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileTest2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("请输入文件名称:");
        String txt = sc.next();
        File dir = new File("Day12_file_bytestream\\aaa");
//        if (!dir.exists()){
//            dir.mkdirs();
//            File file = new File("Day12_file_bytestream\\aaa\\a.txt");
//            file.createNewFile();
//        }else {
//            File file = new File("Day12_file_bytestream\\aaa\\a.txt");
//            file.createNewFile();
//        }

        if (!dir.mkdirs()){
            dir.mkdirs();
        }
        File file = new File(txt);
        File file1 = new File("Day12_file_bytestream\\aaa\\"+file);
        if (file1.createNewFile()){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败,请重试");
            file1.delete();
        }

    }
}
