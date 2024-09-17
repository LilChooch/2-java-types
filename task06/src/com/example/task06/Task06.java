package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = Math.abs(x+y);
        String comsum = String.valueOf(sum);
        int cntsum = 0;

        for(int i = 0; i < comsum.length(); i++)
        {
                cntsum++;

        }

        return cntsum;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
