package chap_06;

public class _07_VariableScope {
    public static void methodA(){
        // System.out.println(number);
        // System.out.println(result);
    }

    public static void methodB(){
        int result = 1;
    }

    public static void main(String[] args) {
        // 변수의 범위
        // 1. 메인 영역 내에서 선언된 변수는 메인 영역 내에서만 사용가능
        // 2. 메소드 내에서 선언된 변수는 메소드 내에서만 사용가능
        // 3. 변수는 선언된 중괄호 안에서만 사용가능
        // 4. 사용가능 범위 이외에도 사용하고자 한다면, 전달값을 이용할 것
        // 선언된 지역에서만 사용할 수 있는 "지역변수"
        int number = 3;

        // System.out.println(result);

        // for문에서 선언된 i는 for문 안에서만 사용가능
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);

        {int j = 0;}
        // System.out.println(j);
    }
}
