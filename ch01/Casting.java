package ch01;

public class Casting {
    // 형 변환
    public static void main(String[] args) {
        int n1 = 100; // 4byte (21억)
        System.out.println(n1);
        double d1 = n1; // 묵시적 업캐스팅
        System.out.println(d1);
        System.out.println("===================");

        long longType = 100;
        int intType = (int)longType; // 명시적 다운캐스팅
        System.out.println(intType); 
    }
}
