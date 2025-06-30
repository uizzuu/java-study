package ch02;

import java.util.Scanner;

// 조건을 판단하고 처리할 때 사용하는 문법
public class IfCondition {
    public static void main(String[] args) {
    // 성적이 60점 이상이면 합격, 불합격
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.println(name + "님의 성적을 입력하세요 : ");
        int score = sc.nextInt();
    // 삼항연산 System.out.println(name + "님은 " + (score >= 60 ? "합격" : "불합격") + "하셨습니다.");
    // If문
        if (score == 100) {
            System.out.println(name + "님은 합격하셨습니다.");
            System.out.println("만점입니다!");
        } if (score >= 60 && score != 100) {
            System.out.println(name + "님은 합격하셨습니다.");
            System.out.println((score - 60) + "점을 더 맞았습니다.");
        } if (score < 60 && score != 100) {
            System.out.println(name + "님은 불합격하셨습니다.");
            System.out.println((60 - score) + "점이 부족합니다.");
        }
    }
}
