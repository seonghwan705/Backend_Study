package chap_04;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class _04_SwitchCase {
    public static void main(String[] args) {

        // Switch Case
        // 석차에 따른 장학금 지급
        // 1등 : 전액장학금
        // 2등 : 반액장학금
        // 3등 : 반액장학금
        // 그 외 : 장학금 대상 아님

        int ranking = 5; // 등수
        if (ranking==1) {
            System.out.println("전액장학금");
        } else if (ranking==2||ranking==3) {
            System.out.println("반액장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용

        ranking = 1;

        switch ( ranking ){
            case 1 :
                System.out.println("전액장학금");
                break;
            case 2 :
                System.out.println("반액장학금");
                break;
            case 3 :
                System.out.println("반액장학금");
                break; // case 2와 3 합치기 가능, 반환값 동일, 밑줄=중복표시
            default:
                System.out.println("장학금 대상 아님");
            }
        System.out.println("조회 완료 #2");

        // case 2와 3을 통합
        ranking = 3;

        switch ( ranking ){
            case 1 :
                System.out.println("전액장학금");
                break;
            case 2 :
            case 3 :
                System.out.println("반액장학금");
                break; // case 2와 3 합치기 가능, 반환값 동일
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격책적 (1급:최상, 4급:최하)

        int grade =3; // 등급
        int price=7000; // 기본가격
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;

        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 : 10000원
        // 2등급 : 9000원
        // 3등급 : 8000원

        // 값이 명확할 때 "switch case문"
        // 범위 값일 때 "if문"
    }
}

