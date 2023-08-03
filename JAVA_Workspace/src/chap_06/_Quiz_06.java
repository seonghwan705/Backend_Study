package chap_06;

public class _Quiz_06 {
    public static String getHiddenDate(String data, int index){
        String hiddenDate = data.substring(0,index);
        for (int i = 0; i < data.length()-index; i++) {
            hiddenDate+="*";
        }
        return hiddenDate;
    }

    public static void main(String[] args) {
        // 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오.
        // [ 조건 ]
        // 1. 개인정보를 비공개로 전환하는 메소드 작성
        // 2. 하나의 메소드에서 모든 동작 처리
        // 각 정보는 아래 위치부터 비공개 적용
        // 이름(2번째 글자), 주민번호(9번째 글자), 전화번호(10번째 글자)

        String name = "김성환"; // 이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenDate(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenDate(id, 8));
        System.out.println("전화번호 : " + getHiddenDate(phone, 9));
    }
}
