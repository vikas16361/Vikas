package com.company;

import java.util.Locale;
import java.util.Scanner;

public class UsingPalin {

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            String str=in.nextLine().toLowerCase(Locale.ROOT);
            String rev="";
            int c=0;
            for (int i=0;i<str.length();i++){
                if(str.equals(rev)&&(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u')){
                    c++;
                }
            }
            System.out.println(c);
        }}





