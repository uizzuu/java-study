package ch02;

import java.util.Scanner;

public class ConfirmGender {
    public static void main(String[] args) {
        // 주민번호 뒷자리 첫 숫자를 입력하세요
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 뒷자리 첫 숫자를 입력하세요");
        int gender = sc.nextInt();
        String result;

        if (gender == 1 || gender == 3) {
            result = "대한민국 남성입니다.";
        } else if (gender == 2 || gender == 4) {
            result = "대한민국 여성입니다.";
        } else if (gender == 5){
            result = "외국인입니다.";
        } else {
            result = "잘못 입력하셨습니다.";
        }
        System.out.println(result);
    }
}
