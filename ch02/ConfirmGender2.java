package ch02;

import java.util.Scanner;

public class ConfirmGender2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result;

        if (num > 5 || num < 1) {
            result = "잘못 입력하셨습니다.";
        } else if (num == 5) {
            result = "외국인입니다.";
        } else if ((num % 2) == 0) {
            result = "대한민국 여성입니다.";
        } else {
            result = "대한민국 남성입니다.";
        }
        System.out.println(result);
    }
}
