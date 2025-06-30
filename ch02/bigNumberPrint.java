package ch02;

import java.util.Scanner;

public class bigNumberPrint {
    public static void main(String[] args) {
        //  두 수를 차례로 입력 => (1) 20 (2) 40
        // 입력 받은 두 수를 큰 순서대로 바꾸어서 출력 => (1) 40 (2) 20

        Scanner sc = new Scanner(System.in);
        System.out.println("서로 다른 두 정수를 각각 입력해주세요.");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        System.out.println("두 정수를 더 큰 숫자부터 나열한다면");
        if (firstNum > secondNum) {
            System.out.println("First : " + firstNum + ", Second : " + secondNum);
        } else {
            System.out.println("First : " + secondNum + ", Second : " + firstNum);
        }
        System.out.println("==========================");

        //성적
        System.out.println("성적을 입력하세요");
        int score = sc.nextInt();
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 성적은 : " + grade);
    }
}
