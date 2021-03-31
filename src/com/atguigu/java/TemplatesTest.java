package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * Create By 唐柳青 on 2021/3/28-21:32
 * idea中代码模板所处的位置在settings-Editor-Lives Templates/Postfix Completion
 * 1.常用的模板
 */
public class TemplatesTest {
    //模板六：prsf: 可生成private static final   /大小写转换ctrl+shift+u
    private static final Customer CUST=new Customer();
    //变形：psf
    public static final int NUW=1;
    //变形：psfi
    public static final int NUM=2;
    //变形psfs
    public static final String NATTION="china";


    //模板一：psvm
    public static void main(String[] args) {
    //模板二：sout
        System.out.println("hello");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        
        int num1=10;
        System.out.println("num1 = " + num1);
        int num2=20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模板三fori
        String[] arr=new String[]{"Tom","Jerry","Hanmeimei","Lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形一iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形二itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);

            for (Object o : list) {

        }
            //变形list.fori从头到尾的遍历
        for (int i = 0; i < list.size(); i++) {

        }
        //变形list.forr倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);

        //模板五ifn
        if (list == null) {

        }
        //变形inn
        if (list != null) {

        }
        //变形：xxx.nn / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }

    }
}
