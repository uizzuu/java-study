package ch01;

class IveMember {
        // 장원영을 표현할 수 있는 속성(프로퍼티Properties)(Member), 메서드(Method)
        // 프로퍼티
        String name ;
        int age;
        double height;

        // 메서드
        void dance() {
            System.out.println("장원영이 춤춰요");
        }
    }

    class Jang{
        public static void main(String[] args) {
       IveMember jang = new IveMember(); //인스턴스, 힙에 저장, 힙 위치는 스택이 앎
            jang.name = "장원영";
            jang.age = 22;
            jang.height = 173.5;
            jang.dance();
            System.out.println(jang.name);
        }
    }
