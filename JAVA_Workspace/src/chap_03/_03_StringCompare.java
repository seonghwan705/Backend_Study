package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); // true

        // 대소문자 구분없이 문자열 내용이 같은지 여부체크
        System.out.println(s2. equalsIgnoreCase("python")); // true

        // 문자열 비교 심화
        s1 = "1234"; // s1 과 s2가 참조하는 곳은 서로 같음 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용비교)
        System.out.println(s1==s2); // true (같은걸 참조하는지 비교)

        s1 = new String("1234");  // s1 과 s2가 참조하는 곳은 서로 다름
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true (내용비교)
        System.out.println(s1==s2); // false (같은걸 참조하는지 비교)

        // Java에서 내용비교할 때는 equals() 사용!
    }
}
