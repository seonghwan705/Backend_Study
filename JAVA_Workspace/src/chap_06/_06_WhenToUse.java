package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) { // 메소드 내에서도 다른 메소드 호출가능
        return getpower(number, 2);
    }
    public static int getpower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
    }
        return result;}

    public static void main(String[] args) {
        // 메소드가 필요한 이유 : 반복되는 코드의 최소화

        // 2의 2승을 구하기
        System.out.println(getpower(2,2));

        // 3의 3승을 구하기
        System.out.println(getpower(3,3));

        // 4의 2승 구하기
        System.out.println(getpower(4,2));

    }
}
