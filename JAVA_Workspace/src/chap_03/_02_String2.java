package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환

        System.out.println(s.replace(" and",",")); // "and"를 ","로 변환
        System.out.println(s.substring(7)); // 지정한 위치부터 끝까지 반환
        System.out.println(s.substring(s.indexOf("Java"))); // indexof 위치파악 후, 해당 위치부터 끝까지 반환
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // 시작위치부터 끝 위치 "직전"까지

        // 공백제거
        s =  "          I love Java.         ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1+s2); // JavaPython
        System.out.println(s1+", "+s2); // Java, Python
        System.out.println(s1.concat(", ").concat(s2)); // Java, Python


    }
}
