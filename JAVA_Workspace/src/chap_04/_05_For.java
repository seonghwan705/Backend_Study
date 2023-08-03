package chap_04;

import java.sql.SQLOutput;

public class _05_For {
    public static void main(String[] args) {

        // 반목문 for

        // SH 매장
        System.out.println("어서오세요, SH입니다.");
        // 또 다른 손님이 들어오면?
        System.out.println("어서오세요, SH입니다.");
        System.out.println("어서오세요, SH입니다.");
        System.out.println("어서오세요, SH입니다.");
        System.out.println("어서오세요, SH입니다.");
        System.out.println("어서오세요, SH입니다.");
        System.out.println("어서오세요, SH입니다.");
        // 인사법이 바뀌면?
        System.out.println("환영합니다, SH입니다.");
        System.out.println("환영합니다, SH입니다.");
        System.out.println("환영합니다, SH입니다.");
        // 매장이름이 바뀌면?
        System.out.println("환영합니다 성환입니다.");
        System.out.println("환영합니다 성환입니다.");
        System.out.println("환영합니다 성환입니다.");

        System.out.println(" ---- 반복문 사용 ---- ");

        //반복문 For
        // for (초기값 ; 조건식 ; 증감식)
        // 0부터 9까지 10번 반복
        for (int i=0;i<10;i++){
            // System.out.println("어서오세요, SH입니다."+i);
            //System.out.println("환영합니다, SH입니다."+i);
            System.out.println("환영합니다, 성환입니다."+i);
        }

        // 짝수만 출력, 단축키 : fori
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i); // 0 2 4 6 8
        }
        System.out.println();

        // 홀수만 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i); // 1 3 5 7 9
        }

        System.out.println();

        // 거꾸로 숫자 출력 5, 4, 3, 2, 1
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        // 1부터 10까지의 수들의 합
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");





    }
}
