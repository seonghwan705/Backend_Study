package chap_03;

public class _04_ExcapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // 종류 : \n, \t, \\, \", \'

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 들여쓰기 효과
        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // 역 슬래시 표현하고싶을 땐 두 번 사용!
        System.out.println("C:\\Program Files\\Java");

        // \" : ""를 출력하고 싶을때
        System.out.println("단비가 \"냐옹\"이라고 했어요");

        // \' : '' 를 출력하고 싶을때, char 자료형일 때 사용!
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c ='a';
        c = '\'';               // 이럴 때 사용
        System.out.println(c);


    }
}
