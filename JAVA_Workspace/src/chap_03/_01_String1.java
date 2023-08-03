package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29 length 문자열 길이 나타내줌

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변경
        System.out.println(s.toLowerCase()); // 소문자로 변경

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // Java 문자의 위치정보 7
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1
        System.out.println(s.indexOf("and")); // 처음으로 일치하는 위치정보 (12)
        System.out.println(s.lastIndexOf("and")); // 마지막으로 일치하는 위치정보 (23)
        System.out.println(s.startsWith("I like")); // 해당 문자열로 시작하면 true, 아니면 false
        System.out.println(s.endsWith(".")); // 해당 문자열로 끝나면 true, 아니면 false
    }
}
