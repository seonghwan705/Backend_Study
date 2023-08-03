package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number; : 이렇게도 생략가능
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;   // 자동으로 포맷 위치 맞추기 ctrl + alt + l
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }




    public static void main(String[] args) {
        // 전달값과 반환값이 함께 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal); // 2 * 2 = 4

        retVal = getPower(3);
        System.out.println(retVal); // 3 * 3 = 9

        retVal = getPowerByExp(3,3);
        System.out.println(retVal); // 3 * 3 * 3 = 27
        System.out.println(getPowerByExp(4,5)); // 4 * 4 * 4 * 4 * 4 = 1024
        System.out.println(getPower(5)); // 5 * 5 = 25
    }
}
