package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {

        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 이외는 아이스 아메리카노 +1

        boolean hallabongade = false; // 한라봉 에이드
        boolean mangojuice = false; // 망고 주스
        boolean orangejuice = false;

        if (hallabongade) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangojuice) {
            System.out.println("망고 주스 +1");
        } else if (orangejuice) {
            System.out.println("오렌지 주스 +1");
       }
        System.out.println("음료 주문 완료 #1");

        // else 는 없어도 가능

    }
}
