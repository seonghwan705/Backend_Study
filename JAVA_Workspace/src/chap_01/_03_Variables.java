package chap_01;
// 변수 = 값을 저장하는 공간
public class _03_Variables {
    public static void main(String[] args) {
        String name = "김성환";
        int hour = 15;

        System.out.println(name + " 고객님, 배송이 곧 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + " 고객님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "개성군";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println(name + "님의 학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        // 실수는 보통 double(정밀한 소수) 인데 f붙이면 float(작은 소수)으로도 가능
        System.out.println(d);
        System.out.println(f);

        int i = 10000000;
        // int형 최대 범위 -21억 ~ +21억, 오류이유 : 범위값 초과
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

        // 자료형 종류 : int, long, float, double, char, String, boolean
    }
}
