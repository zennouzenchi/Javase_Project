package com.itheima.fileTest;

import java.io.File;

public class fileTest3 {
    public static void main(String[] args) {
        File src = new File("Day12_file_bytestream\\");
        deleteDir(src);
    }

    private static void deleteDir(File src) {
        //����src�ļ���,�õ��������ݵ�file����
        File[] files = src.listFiles();
        //����files�õ��ļ�����ÿһ��file����
        for (File file : files) {
            //������ļ���ֱ��ɾ��
            if (file.isFile()){
                file.delete();
            }else {
                //������ļ���,ֱ�ӵݹ�
                deleteDir(file);
            }
            //���ļ����ڲ���������ɾ����,ɾ���Լ�
        }src.delete();
    }
}
