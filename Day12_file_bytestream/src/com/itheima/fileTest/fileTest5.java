package com.itheima.fileTest;
import java.io.File;
import java.util.HashMap;

public class fileTest5 {
    static HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        File dir = new File("E:\\");
        method(dir);
        map.forEach( (s, integer) -> System.out.println(s+"บ๓ืบ"+integer));
    }

    private static void method(File dir) {
        File[] files = dir.listFiles();
        if (files != null){
            for (File file : files) {
                if (file.isFile()){
                    String name = file.getName();
                    int i = name.lastIndexOf(".");
                    String suff = name.substring(i+1);
                    if (map.containsKey(suff)){
                        Integer integer = map.get(suff);
                        map.put(suff,integer + 1);
                    }else {
                        map.put(suff,1);
                    }
                }else {
                    method(file);
                }
            }
        }
    }
}
