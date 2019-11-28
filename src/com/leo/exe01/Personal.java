package com.leo.exe01;

/**
 * Created by ktkwon on 2019. 11. 26..
 */

public class Personal {
    public static void main(String[] args) {
        String message = String.format("%d + %d = %d", 1, 2, 1 + 2);
        System.out.println(message);
        System.out.println(String.format("%d + %d = %d", 1, 2, 1+2));

    }

    public void extractParameter() {
        extractParameter(10);
    }

    public void extractParameter(int x){
        System.out.println(x);
        System.out.println(x);
    }
}
