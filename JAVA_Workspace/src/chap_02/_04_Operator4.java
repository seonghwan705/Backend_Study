package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개||계란말이||제육볶음); // 하나라도 참이면 참
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 참이면 참

        // and 연산
        System.out.println((5>3) && (3>1)); // true
        System.out.println((5>3) && (3<1)); // false

        // or 연산
        System.out.println((5>3) || (3>1)); // true
        System.out.println((5>3) || (3<1)); // true
        System.out.println((5<3)||(3<1)); // false

        // System.out.println(1 < 3 < 5); 안되는 예제

        // 논리부정 연산자 '!'
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5==5)); // false
        System.out.println(!(5==3)); // true






    }
}
