package com.itheima.fileTest;

import java.io.File;
import java.io.IOException;

public class file_IO_Test1 {
    public static void main(String[] args) throws IOException {
        File f2 = new File("D:\\aa\\bb\\cc.txt");
//        f2.createNewFile();
        //�������ļ�ʱ��ָ���ļ���δ����ʱ������ᱨ��.
        //��Ҫ�ȴ����ļ���:
        File dir1 = new File("D:\\aa");
        //���������ļ���ֻ��һ����ʱ�����mkdir�������������ļ���
        dir1.mkdir();
        File dir2 = new File("D:\\aa\\bb");
        //���༶�ļ��д���ʱ��Ҫ����mkdirs������
        dir2.mkdirs();
        //�ܽ᣺���۴��������ļ���,�����Ե���mkdirs����
        f2.createNewFile();
        //�����ļ���֮���ٴ����ļ��Ͳ��ᱨ����
        File f1 = new File("D:\\aa\\bb\\cc.txt");
        System.out.println(f1.delete());
        //��ָ���ļ���������������ʱ������delete������ʧ��
        //���Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ��У�Ŀ¼��
        System.out.println(f1.isDirectory());
        //���Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
        System.out.println(f1.isFile());
        //���Դ˳���·������ʾ��File�Ƿ�Ϊ����
        File file = new File("a.txt");
        System.out.println(file.exists());
        //�����ɴ˳���·������ʾ���ļ���Ŀ¼����
        //������õ�ʱ���ļ��У���ȡ�����ļ�������
        //������õ����ļ������ȡ�����ļ���
        System.out.println(f1.getName());
    }
}
