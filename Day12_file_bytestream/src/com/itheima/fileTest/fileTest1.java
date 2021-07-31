package com.itheima.fileTest;

import java.io.File;

public class fileTest1 {
    public static void main(String[] args) {
        File dir = new File("D:\\aa.txt");
        if (!dir.exists()) {
            dir.mkdirs();
            System.out.println("创建成功");
        }else {
            System.out.println("文件已存在");
        }
        if (dir.exists()){
            dir.delete();
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}
