package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {

        // [ 퀴즈 5 ]
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오

        // [ 조건 ]
        // 1) 신발 사이즈는 250부터 295까지 5단위로 증가
        // 2) 신발 사이즈 수는 총 10가지

        // [ 실행결과 ]
        /*
        사이즈 250 (재고 있음)
        사이즈 255 (재고 있음)
        ......
        사이즈 295 (재고 있음)
        */

        /*  내가 푼 것
        
        int size[]= {250,255,260,265,270,275,280,285,290,295};
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 "+size[i]+" (재고 있음)");}
            
            */


        // 문제풀이
        int[] sizearray = new int[10];                              // 배열 선언
        for (int i = 0; i < sizearray.length; i++) {                // 배열에 값 삽입
            sizearray[i] = 250 + (5 * i);
        }
        for (int size :                                             // 배열 순회 출력
                sizearray)  {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
            
    }
}
