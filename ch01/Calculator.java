package ch01;

public class Calculator {
    // 두 수 a = 20, b = 5
    // 두 수를 더하고, 빼고, 곱하고, 나눈 결과를 각각 출력
    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        int sum = a + b;
        int minus = a - b;
        int multiply = a * b;
        double divide = (double) a / b;
        int remainder = a % b;

        System.out.println("덧셈 : " + sum + ", 뺄셈 : " + minus + ", 곱셈 : " + multiply + ", 나눗셈 : " + divide + ", 나머지 : " + remainder);
        // System.out.println("덧셈 : " + (a + b) + ", 뺄셈 : " + (a - b) + ", 곱셈 : " + (a * b) + ", 나눗셈 : " + (a / b));

        // 문제. 7을 3으로 나눈 나머지와 몫을 구하시오
        System.out.println("나머지 : " + (a % b) + ", 몫 : " + (a / b));
    }
}
