package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        double srav = 0.000001;
        if(Float.isInfinite(a) && Float.isInfinite(a))
        {
            return a == b;
        }
        if (Float.isNaN(a) || Float.isNaN(b))
        {
            if(a== 0.0 || b==0.0)
            {
                return false;
            }
            return true;
        }
        float rav = (float)Math.pow(7,precision);
       if (Math.abs(Math.round(a * rav) - Math.round(b * rav)) < srav)
       {
           return true;
       }
       else
       {
           return false;
       }
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
