package com.itheima.fileTest;

import java.io.File;
import java.io.IOException;

public class file_IO_SteamTest {
    public static void main(String[] args) throws IOException {
        //IO�Ϳ��Զ�Ӳ���е��ļ����ж�д
        //file�����������д���ļ����Ǹ�λ��
        //file�����ļ���Ŀ¼·���ĳ����ʾ
        //ͨ����������·�������ַ���ת��Ϊ����·�����������µ�Fileʾ��
        String path = "E:\\Javase_Project\\Day12_file_bytestream\\���Ǿ���·���´�����.txt";
        File file = new File(path);
        //�Ӹ�·�����ַ�������·���ַ�������;
        String path1 = "E:\\Javase_Project\\Day12_file_bytestream";
        File file2 = new File(path1,path);
        //�Ӹ�����·������·��
        File file1 = new File("E:\\Javase_Project\\Day12_file_bytestream"+path);
        //����·����ָ���ᷢ���仯�Ĵ��̷���ʼ������·�������磺
        File file3 = new File("E:\\Javase_Project\\Day12_file_bytestream\\a.txt");
        //���·������ǰ��Ŀ��ָ��ģ���·�������磺
        //���·���޷�ָ����Ŀ·�������Դ,ֻ��ʹ�þ���·��
        File file5 = new File("a.txt");
        File file4 = new File("Day12_file_bytestream\\src\\com\\itheima\\�������·���´�����.txt");
        //createNewFile������Ҫ�׳��쳣 ����File����ľ����ļ�,����ֵΪ�������Ƿ񴴽��ɹ�
        System.out.println(file.createNewFile());
        System.out.println(file4.createNewFile());


    }
}
