package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // 자바 프로그램 실행 시 처음으로 진입하는 메소드
        // 1. 반환값은 없음 'void'
        // 2. 전달값은 String[] args
        // 3. 목적에 따라 프로그램 실행을 다르게 할 수 있는 것 "메인 메소드"
        for (String s :
                args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if(args.length==1){  // 실행 키 옆 test에서 수정 길이 1
            switch (args[0]){ // 배열의 첫 번지의 주소
                case "1" :
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else
            System.out.println("사용법) 1~3 메뉴 중 하나를 입력하세요.");
    }
}
