package com.itheima.fileTest;

import java.io.File;

public class fileTest1 {
    public static void main(String[] args) {
        File dir = new File("D:\\aa.txt");
        if (!dir.exists()) {
            dir.mkdirs();
            System.out.println("�����ɹ�");
        }else {
            System.out.println("�ļ��Ѵ���");
        }
        if (dir.exists()){
            dir.delete();
            System.out.println("ɾ���ɹ�");
        }else {
            System.out.println("ɾ��ʧ��");
        }
    }
}
