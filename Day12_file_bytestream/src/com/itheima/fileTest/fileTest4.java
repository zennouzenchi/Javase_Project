package com.itheima.fileTest;

import java.io.File;

public class fileTest4 {
    static int count = 0;
    public static void main(String[] args) {
        File dir = new File("Day12_file_bytestream");
        System.out.println(method(dir));
    }

    private static int method(File dir) {
        File[] files = dir.listFiles();
        if (files != null){
            for (File file : files) {
                if (file.isFile()){
                    if (file.getName().endsWith(".java")){
                        count++;
                    }
                }else {
                    method(file);
                }
            }
        }return count;
    }
}
