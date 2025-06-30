package ch01;

public class ExchangeMoney {

    // 잔액을 출력하는 함수

    public static void main(String[] args) {
        // 문제
        // 2,680원을 1,000원, 500원, 100원, 50원, 10원짜리로 각각 몇 개씩 최소로 필요한지 출력
        // 출력
        // 금액 : 2,680원
        // 1000원 : 2개
        // 500원 : 1개
        // 100원 : 1개
        // 50원 1개
        // 10원 : 3개

        int money = 2680;
        System.out.println("금액 : " + money + "원");
        int n1 = money / 1000;
        System.out.println("1000원 : " + n1 + "개");
        int n2 = (money - 1000 * n1) / 500;
        System.out.println("500원 : " + n2 + "개");
        int n3 = (money - 1000 * n1 - 500 * n2) / 100;
        System.out.println("100원 : " + n3 + "개");
        int n4 = (money - 1000 * n1 - 500 * n2 - 100 * n3) / 50;
        System.out.println("50원 : " + n4 + "개");
        int n5 = (money - 1000 * n1 - 500 * n2 - 100 * n3 - 50 * n4) / 10;
        System.out.println("10원 : " + n5 + "개");
        System.out.println("==========================");


        // 선생님
        // 초기 금액 저장
        int coin = 2680;
        int restCoin = coin;
        System.out.println("금액 : " + coin + "원");

        // 1000원의 갯수
        System.out.println("1000원 개수 : " + (coin / 1000));
        // 1000원 갯수를 뺀 나머지를 구하기
        restCoin = restCoin % 1000;

        // 500원의 갯수
        System.out.println("500원 개수 : " + (restCoin / 500));
        // 500원 갯수를 뺀 나머지를 구하기
        restCoin = restCoin % 500;

        // 100원의 갯수
        System.out.println("100원 개수 : " + (restCoin / 100));
        // 100원 갯수를 뺀 나머지를 구하기
        restCoin = restCoin % 100;

        // 50원의 갯수
        System.out.println("50원 개수 : " + (restCoin / 50));
        // 50원 갯수를 뺀 나머지를 구하기
        restCoin = restCoin % 50;

        // 10원의 갯수
        System.out.println("10원 개수 : " + (restCoin / 10));
        // 10원 갯수를 뺀 나머지를 구하기
        restCoin = restCoin % 10;
        System.out.println("==========================");

        // 간소화
        int mon = 2680;
        int restMon = mon;
        System.out.println("금액 : " + mon + "원");

        restMon = restMonPrint(restMon, 1000);
        restMon = restMonPrint(restMon, 500);
        restMon = restMonPrint(restMon, 100);
        restMon = restMonPrint(restMon, 50);
        restMon = restMonPrint(restMon, 10);
    }

    static int restMonPrint(int restMon, int don){
        System.out.println(don + "원 개수 : " + (restMon / don));
        restMon = restMon % don;
        System.out.println("잔액 : " + restMon);
        return restMon;
    }
}
