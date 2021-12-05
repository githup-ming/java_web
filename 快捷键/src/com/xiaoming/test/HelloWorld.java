package com.xiaoming.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
/**
 *
 *
 *
 *
 *
 *
 */

/**
 * @author xiaoming.dong
 * @create 2021-12-05 13:05
 */
public class HelloWorld extends Persion{
    private static final int initial_size = 10;
    private static final int busst = 30;
    public static final int i =5;
    public static final String str = "str";
    private static int a;
    private static int b;

    @Override
    public void eat() {
        System.out.println("hello 吃饭");
    }

    public static void main(String[] args) {
        //region Description
        System.out.println("hello world");
        System.out.println("xiaoming");
        System.out.println("hello world");
        //endregion
        Date date = new Date();
        Date date1 = new Date();
        ArrayList list1 = new ArrayList();

        System.out.println("list1 = " + list1);
        System.out.println("HelloWorld.main");
        System.out.println("args = " + Arrays.deepToString(args));


        String[] strings = {"tom", "join"};
        for (int i = 0; i < strings.length; i++) {

        }

        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(343);
        list.add(54);

        for (int i = 0; i < list.size(); i++) {

        }
        for (Object o : list) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        if (list == null) {

        }
        if (list != null) {

        }

        if (list == null) {


        }
        if (list != null) {

        }




        list1.add(0,23);


    }


    public static void method1(){
        a = 5;
        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }








    }

}
