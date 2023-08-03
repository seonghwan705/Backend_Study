package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차요금 정산 프로그램
        // [ 조건 ]
        // 1) 주차요금은 시간당 4,000원 (일일 최대 요금은 30,000원)
        // 2) 경차 또는 장애인 차량은 최종요금에서 50% 할인
        // [ 예시 & 실행결과 ]
        // 1) 일반 차량 5시간 주차 시 20,000원
        // - 주차 요금은 20000원 입니다.
        // 2) 경차 5시간 주차 시 10,000원
        // - 주차 요금은 10000원 입니다.
        // 3) 장애인 차량 10시간 주차 시 15,000원
        // - 주차 요금은 15000원 입니다.

        int hour=10; // 주차 시간
        boolean smallcar = false; // 경차여부
        boolean disabled = true; // 장애인 차량 여부
        int fee = hour * 4000; // 시간 당 4000원 곱하기

        // 30000원 초과 시 일일 최대요금으로 수정
        if (fee>30000){
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if(smallcar||disabled) {
            fee/=2;
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");


    }
}
