package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String str = String.valueOf(value);
        StringBuilder b = new StringBuilder(str).reverse();
        String a = String.valueOf(b);
        int a1 = Integer.valueOf(a);

        return a1 ;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
