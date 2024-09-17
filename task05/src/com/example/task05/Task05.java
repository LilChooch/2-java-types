package com.example.task05;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class Task05 {

    public static String solution(int x) {

       String s = String.valueOf(x);
       int cnt = 0;
       String w ;
       for(int i = 0 ; i < s.length();i++)
       {
           char q = s.charAt(i);
           int y = Integer.valueOf(q);
           if(y%2==0)
           {
               cnt+=0;
           }
           else
           {
               cnt = 1;
           }

       }
       if(cnt==0)
       {
           w="TRUE";
       }
       else
       {
           w="FALSE";
       }

        return w;
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
