package chap_04;

public class _02_Else {
    public static void main(String[] args) {

        // 조건문 If Else
        int hour = 10;
        if (hour<14) { // 오후 2시 이전이면 아래 명령문 실행
            System.out.println("아이스 아메리카노 +1");}

        // 그 외의 경우이면 아래 else문 실행
        else {
                System.out.println("아이스 아메리카노(디카페인) +1");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이후, 모닝커피 마신경우!

        hour = 15;
        boolean morningcoffee=true;

        if (hour>=14||morningcoffee) {
            System.out.println("아이스 아메리카노(디카페인) +1");}
        else {
            System.out.println("아이스 아메리카노 +1");}
        System.out.println("커피 주문 완료 #2");
        }
    }

