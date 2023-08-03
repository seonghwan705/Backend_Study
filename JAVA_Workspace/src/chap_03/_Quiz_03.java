package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {

        // 참고
        // 1) 주민등록번호는 13자리의 숫자로 구성
        // 2) 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별정보
        // 3) 입력 데이터는 -을 포함한 14자리의 문자열 형태

        // 예시
        // 1) "901231-1234567" 인 경우 901231-1까지 출력
        // 2) "030708-4567890" 인 경우 030708-4까지 출력

        String id = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0,id.indexOf("-")+2)); // 0 위치부터 하이픈 위치+2 직전까지

        String id2 = "030708-4567890"; // 주민등록번호 13자리
        System.out.println(id2.substring(0,8));
        System.out.println(id2.substring(0,id2.indexOf("5"))); // 0 위치부터 5 위치전까지
        System.out.println(id.substring(0,id.lastIndexOf("2"))); // 0 위치부터 마지막 2 위치전까지
    }
}
