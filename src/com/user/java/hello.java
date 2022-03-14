package com.user.java;

import java.util.ArrayList;

/**
 * @author Administrator
 * @create 2022-03-14-13:51
 */
public class hello {


        public static void main(String[] args) {
            ArrayList list=new ArrayList();
            list.add("a");
            list.add("b");
            list.add("c");

            //list.fori正序
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i);
            }
            //list.forr倒序
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(i);
            }

            //ifn  if判断
            if (list == null) {
                System.out.println("11");
            }


        }
        //prsf
        //private static final a;

        //psf
        //public static final b;

        //psfi
        //public static final int v；

        //psfs
        //public static final String str="aaa";

}
