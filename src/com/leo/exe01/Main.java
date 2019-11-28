package com.leo.exe01;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Optional;

/**
 * Created by ktkwon on 2019. 11. 21..
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("현재 줄을 복사합니다.");
        String profile = "안녕 인텔리제이 환영";

        for (int n = 0; n < 10; n++) {
            System.out.println("라인 test");
            System.out.println("라인 test");
            System.out.println("라인 test");
            System.out.println("라인 test");
            System.out.println("라인 test");
            System.out.println("라인 test");
            System.out.println();

        }

        String s = "안녕하세요. 반값습니다. IntelliJ IDEA Community 2018 Version.";
        System.out.println(Optional.of(new Member().getCourse()));

        Calendar calendar = new GregorianCalendar(Locale.KOREAN);
    }

}


