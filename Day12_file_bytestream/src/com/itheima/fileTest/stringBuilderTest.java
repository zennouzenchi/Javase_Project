package com.itheima.fileTest;

public class stringBuilderTest {
    public static void main(String[] args) {
        System.out.println("filetest");
        //�ַ���String �ص㣬һ���������ܸı�
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        //����ƴ�ӵײ�����Զ��Ż����ص�(������
        String s4 = s1+s2+s3;
        //"ab"+"c"+"abc"������ò������м��ַ���
        //����ַ���ƴ�Ӵ����࣬����ʹ��String
        //StringBuilder����:
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2).append(s3);
        //�ײ�Ϊ�ַ�����,���տ���һ����toString
        //���Լ����м��ַ����Ĳ���
        String newStr = sb.toString();
    }
}
/**
 �ܽ᣺
    1.���ƴ�ӵ��ַ������ǳ��������ϳ����Ż�����
    2.���ƴ���ַ����б������ڣ�
        String S4 = S1+S2+S3;
        new StringBuilder.append(S1)....append(S3)..
    3.���շ�����
        �Լ�����StringBuilder�����Լ�ƴ��

 */
