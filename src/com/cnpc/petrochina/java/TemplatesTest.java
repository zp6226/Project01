package com.cnpc.petrochina.java;


import com.cnpc.petrochina.bean.Customer;

import java.util.ArrayList;

/**
 * @Auther: Administrator
 * @Date: 2018/10/9 0009 15:11
 * @Description:
 * 1.常用模板
 *
 *
 */
public class TemplatesTest {
    //模板6 prsf
    private static final TemplatesTest test = new TemplatesTest();
    private static final int i = 10 ;
    private static final Customer customer = new Customer();
    //变形 psf
    public static final int a =10;
    public static final String  s ="12";



    //模板1：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println("hello world");
        /*变形： soutp直接打印形参
                soutm 直接打印方法名
                soutv 直接打印变量
                xxx.sout
          */
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num =10;
        int num2 =20;
        System.out.println("num = " + num);
        System.out.println(num2);
        //模板三：fori
        String[] arr = new String []{"tom","jerry","jack"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        /*
        * 变形：iter
        * 增强for循环
        *
        * */
        for (String s : arr) {
            System.out.println(s);
        }
        /*
        * 变形：itar普通for循环
        *
        * */
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for  alt+回车跟Ctrl+1一样
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(234);
        //list.for
        for (Integer integer : list) {
            System.out.println(integer);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }
    public void method(){
        //ifn
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(234);
        if (list == null) {

        }
        //变形inn
        if (list != null) {
            
        }
        //变形xxx.nn /xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
        /**
         *客户姓名
         */
         private String name;
         /**
          *
          *客户ID
          */
          private Integer id;
          /**
           *客户id
           */
           private Integer id;
           
          


    }



}


