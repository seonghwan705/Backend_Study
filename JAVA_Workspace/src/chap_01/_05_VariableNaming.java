package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수이름 짓는법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫지(123) 사용가능 (공백사용불가)
        // 3. 밑줄 또는 문자로 시작
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 소문자)
        // 6. 예악어 사용 불가 (public, static, void, float, double, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "성환"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "1999-01-12"; // 생년월일
        String residentialAddress = "호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNumber = "KE657"; // 항공편 명
        String _flightNo = "KE657"; // 밑줄 시작
        String flight_no_2 = "KE657"; // 밑줄과 숫자 포함
        // String -flightNo = "KE657";

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
//        String 3item = "휴대폰";

        // 반복문 변수명은 간단하게 하는편 (크게 변수명이 중요하지 않을 때)
        int i = 0;
        String s = "";

        // 절대 변하지 않는 상수는 대문자로 (final 앞에 붙이고 대문자)
        final String CODE = "KR";
    }
}
