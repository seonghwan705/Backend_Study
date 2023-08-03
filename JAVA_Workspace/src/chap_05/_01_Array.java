package chap_05;

import java.sql.SQLOutput;

public class _01_Array {
    public static void main(String[] args) {

        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeross = "아메리카노";
        String coffeerachel = "카페모카";
        String coffeechandler = "라떼";
        String coffeemonica = "카푸치노";

        System.out.println(coffeeross+"하나"); // 아메리카노 하나
        System.out.println(coffeerachel+"하나"); // 카페모카 하나
        System.out.println(coffeechandler+"하나"); // 라떼 하나
        System.out.println(coffeemonica+"하나"); // 카푸치노 하나
        System.out.println("주세요.");

        // 1. 배열 선언 첫 번째 방법
        // String []coffees=new String[4];

        // 2. 두 번째 방법
        // String coffees[]=new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 3. 배열 선언과 동시에 초기화하는 방법
        // String[] coffees = new String[] {"아메리카노", "카페모카","라떼","카푸치노"};

        // 4. 네 번째 방법
        String[] coffees = {"아메리카노", "카페모카","라떼","카푸치노"};

        System.out.println("-----------------------");

        // 커피 주문
        System.out.println(coffees[0]+" 하나"); // 아메리카노 하나
        System.out.println(coffees[1]+" 하나"); // 카페모카 하나
        coffees[2] = "에소프레소"; // 배열 2번지의 값 변경
        System.out.println(coffees[2]+" 하나"); // 라떼 하나
        System.out.println(coffees[3]+" 하나"); // 카푸치노 하나
        System.out.println("주세요.");

        // 다른 자료형?
        int[]i=new int[3];
        i[0]=1;
        i[1]=2;
        i[2]=3;
        double[]d={10.0,11.2,13.5};
        boolean[]b= {true,true,false};




    }
}
