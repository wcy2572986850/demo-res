package com.zzxx.demores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
//这是一个单行注释

/**
 * 这是多行注释
 */
public class Hello {
    public Hello() {
    }

    private static final int INITAL =0;
    public static void main(String[] args) {
        int sum=1;
        for(int i=1;i<=10;i++){
            sum = sum *i;
        }
        System.out.println(sum);
        ArrayList list1 = new ArrayList();//ctrl+鼠标选定指定的对象 //ctrl + shift + t
        Date date = new Date();         //alt +enter
                                        //14.alt + left /alt +right进入上一个界面/下一个界面
                                        //15.fn+f4查看类的继承结构
        list1.add(0,123);

        //method2();

    }
    public void sayHello(){ System.out.println("hello world!!!");

        System.out.println("hahahaha");
    }

    public static void method2(){
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
