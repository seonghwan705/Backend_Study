package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        // 상수 : 한 번 정하고 나면 수정이 불가능한 것, final 붙이면 상수가 됌

        final String KR_COUNTRY_CODE = "+82"; // 국가번호
        // KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final  double PI = 3.141592; // 원주율
        final  String DATE_OF_BIRTH = "1999-01-12"; // 생년월일
        // 상수로 만들 때는 모든 문자 대문자
    }
}
