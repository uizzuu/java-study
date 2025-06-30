package ch01;

// 두 수를 바꾸는 함수
public class BasicJava {
    public static void main(String[] args) {
        // 순서 : 빈 변수 선언 (type = int) > a->temp, b->a, temp(a)->b
        // a와 b 선언하고 초기값 설정.
        int a = 10;
        int b = 20;
        // 빈 변수 선언 => temp로 이름 많이 짓는다.
        int temp;
        // 초기값 출력
        System.out.println("초기값");
        System.out.println("a : " + a + ", b : " + b);
        // 두 수 a, b를 바꾸는 작업
        // 1. a를 temp에 넣는다 (a값을 temp에 할당)
        temp = a;
        // 2. b를 a로 보낸다
        a = b;
        // 3. temp를 b로 보낸다
        b = temp;
        // 결과 출력
        System.out.println("바꾼 결과");
        System.out.println("a : " + a + ", b : " + b);
    }
}
