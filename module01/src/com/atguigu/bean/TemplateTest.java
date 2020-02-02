package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjunyan
 * @create 2020-01-30
 */
public class TemplateTest {
    private static final Integer OLDPEOPLE = 60;

    public static void main(String[] args) {
        System.out.println("args = " + args);
        String str ="sdgsg";
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("TemplateTest.main");
        System.out.println("str = " + str);
        System.out.println(str);



        String[] arr = new String[]{
                "Tom","lilei","hanmeimei"
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
    }

    public void method(){

        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (int i = 0; i < list.size(); i++) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }

    }
}
