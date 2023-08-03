package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // for
        int max = 20; // 최대 치킨판매수량
        int sold = 0; // 현재 치킨판매수량
        int noshow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            // 치킨을 가져가는 상황, 손님이 없음(노쇼)
            if (i == noshow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // continue 만나면 for문의 다음 증감으로 이동!
            }
            sold++; // 판매처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }

        }
        System.out.println("영업을 종료합니다.");

        System.out.println("---------------------------------");

        // while문에서 continue 사용, while 과 for 차이는 초기값, 증감식!
        int index = 0; // 손님번호
        sold = 0;
        while (index <= 50) {
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index==noshow){
                System.out.println(index+"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++; // 판매처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
