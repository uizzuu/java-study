package ch02;

import java.util.Scanner;

public class ThreeNumberTest {
    public static void main(String[] args) {
        // 세 수를 차례로 입력받는다.
        // 가장 큰 수와 가장 작은 수를 출력합니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("서로 다른 세 정수를 각각 입력해주세요.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("가장 큰 수 : " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("가장 큰 수 : " + n2);
        } else {
            System.out.println("가장 큰 수 : " + n3);
        }

        if (n1 < n2 && n1 < n3) {
            System.out.println("가장 작은 수 : " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("가장 작은 수 : " + n2);
        } else {
            System.out.println("가장 작은 수 : " + n3);
        }

        System.out.println("=============================");


        System.out.println("서로 다른 세 정수를 각각 입력해주세요.");

        int a;
        int b;
        int c;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // a와 b를 비교해서 큰 수는 maxNum, 작은 수는 minNum에 넣는다.
        if (a > b) {
            maxNum = a;
            minNum = b;
        } else {
            maxNum = b;
            minNum = a;
        }
        // c가 maxNum보다 크면 c를 maxNum에 넣는다.
        if (c > maxNum) {
            maxNum = c;
        }
        // c가 minNum보다 작으면 c를 minNum에 넣는다.
        if (c < minNum) {
            minNum = c;
        }

        System.out.println("Max : " + maxNum);
        System.out.println("Min : " + minNum);
    }
}
