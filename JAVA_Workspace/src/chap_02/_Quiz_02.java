package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 조건 1) 키 120 이상 탑승가능 2) 삼항연산자 이용
        // 실행결과1) 키가 115cm 이므로 탑승 불가능합니다
        // 실행결과2) 키가 121cm 이므로 탑승 가능합니다

        int tall1 = 115;
        int tall2 = 121;

        String a = (tall1>=120)?"탑승 가능합니다":"탑승 불가능합니다";
        String b = (tall2>=120)?"탑승 가능합니다":"탑승 불가능합니다";

        System.out.println("키가 "+tall1+"cm 이므로 "+a);
        System.out.println("키가 "+tall2+"cm 이므로 "+b);
    }
}
