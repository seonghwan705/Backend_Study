package Chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : "+random.nextInt(10)); // 0이상 10 미만 정수형 반환
        System.out.println("랜덤 실수 : "+random.nextDouble()); // 0.0이상 1.0 미만의 실수값
       // System.out.println("랜덤 실수 (범위) : "+random.nextDouble(10.0));




        // 만약 5.0 이상 10.0 미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : "+ (min+(max-min)*random.nextDouble()));

        System.out.println("랜덤 boolean : "+random.nextBoolean());

        // 로또 번호를 랜덤으로 뽑으려면? 1~45
        System.out.println("로또 번호 : "+(random.nextInt(45)+1));
        // nextint(45) : 0이상 45 미만
        // nextint(45) + 1 : 1 이상 46미만의 수

        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigIntgear, BigDecimal 등등 클래스 구글링 후 참고!
    }
}
