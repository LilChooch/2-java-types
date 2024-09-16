package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float c = 0;
       switch(operation)
       {
           case "+":
               c = a+b;
               break;
           case "-":
               c = a-b;
               break;
           case "*":
               c = a*b;
               break;
           case "/":
               float d = Float.valueOf(a);
               float d1 = Float.valueOf(b);
               c = d/d1;
               break;

       }


        return c;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
