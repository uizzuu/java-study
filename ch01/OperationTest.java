package ch01;

public class OperationTest {
    public static void main(String[] args) {
        // n1 + n2
        int n1 = 3;
        int n2 = 4;
        int sum = n1 + n2;
        System.out.println(sum);
        System.out.println("===============");

        // 반가워요 나의 나이는 20살 이에요.
        String s1 = "반가워요 나의 나이는 ";
        int age = 20;
        String s2 = "살 이에요.";
        String result = s1 + age + s2;
        System.out.println(result);
        System.out.println("===============");

        //n1을 0으로 나눈 결과를 출력해 보세요. => 오류 (0으로는 나누기 불가)
        System.out.println(n1 / 3);
        System.out.println("===============");

        // 비교연산과 논리연산의 결과는 항상 논리값이다.
        boolean trueOrFalse;
        trueOrFalse = 1 == 2;
        System.out.println(trueOrFalse);

        trueOrFalse = 5 != 2;
        System.out.println(trueOrFalse);

        trueOrFalse = 5 >= 2;
        System.out.println(trueOrFalse);

        // x라는 int변수
        // x가 1~10 사이의 값이면 true, 그렇지 않으면 false를 출력
        int x = 20;
        trueOrFalse = (x >= 1) && (x <= 10);
        System.out.println(trueOrFalse);

        trueOrFalse = (x >= 1) || (x <= 10);
        System.out.println(trueOrFalse);
        System.out.println("===============");
        
        // 문자열 비교
        String grade = "VIP";
        String myGrade = "VIP";
        trueOrFalse = grade == myGrade;
        trueOrFalse = grade.equals(myGrade);
        trueOrFalse = grade.equals("일반");
        System.out.println(trueOrFalse);
    }
}
