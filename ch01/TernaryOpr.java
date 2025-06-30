package ch01;

public class TernaryOpr {
    public static void main(String[] args) {
        // 삼항 연산자
        int n1 = 5;

        //조건 비교
        String result;
        result = n1 > 10 ? "크다" : "작다";
        System.out.println(result);

        // score 변수 생성 : 시험점수 70
        // 점수가 60이상이면 pass, 그렇지 않으면 fail을 출력
        int testScore = 70;
        String testResult;
        testResult = testScore >= 60 ? "pass" : "fail";
        System.out.println(testResult);
    }
}
