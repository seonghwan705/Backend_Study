package chap_06;

public class _05_Overloading {
    public static int getPower(int number) { // "4"
        int result = number * number;
        return result;
        // return number * number; : 이렇게도 생략가능
    }
    public static int getPower(String strNumer) {
        int number = Integer.parseInt(strNumer); // 문자열을 정수로 변환
        int result = number * number;
        return result;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;   // 자동으로 포맷 위치 맞추기 ctrl + alt + l
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩 : 같은 이름의 메소드를 여러 번 선언하는 것
        // 추가 설명 : 메소드의 명과 반환 자료형은 같고, 파라미터는 다르게 설정
        // 조건 1. 전달값의 타입이 다르거나
        // 조건 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3)); // 3*3=9
        System.out.println(getPower("4")); // 4*4=16
        System.out.println(getPower(3,3)); // 3*3*3=27
    }
}
