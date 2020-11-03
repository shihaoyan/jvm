package com.shy.jvm;

import java.util.Arrays;

/**
 * @author 石皓岩
 * @date 2020/10/13 16:58
 * 描述:
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(StrToBinstr("Save"));

    }
    private static String StrToBinstr(String str) {
        char[] strChar=str.toCharArray();
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        String result="";
        for(int i=0;i<strChar.length;i++){
            result +=Integer.toBinaryString(strChar[i])+ " ";
        }
        return result;
    }
}
