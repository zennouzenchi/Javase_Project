package com.itheima.fileTest;

import java.io.File;

public class file_IO_ListFile {
    public static void main(String[] args) {
        //��ȡ�ļ������������ļ����ļ���
        //�����������ص��ļ����ļ���
        //��ȡ����ļ����µ������ļ����ļ��е�file���󣬷��������з���
        File file = new File("D:\\");
        File[] files = file.listFiles();
        for (File path : files) {
            System.out.println(path);
        }
        /**ע������:
         * 1.����������һ���ļ�ʱ ����null
         * 2.����������һ�����ļ���ʱ �᷵�س���Ϊ0������
         * 3.����������һ�������ݵ��ļ�ʱ ����ļ�·��װ�������з���
         * 4.����������һ����Ȩ�޲��ܽ����ļ���ʱ ����null
         * �ܽ᣺��������һ���ļ���·�������ڡ�û��Ȩ�޶�����null��
        */
    }

}
