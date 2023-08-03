package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {

        /*버스 번호는 "1234", "상암08" 과 같은 형태
        남은 시간은 분 단위 (예 : 3분, 5분)
        남은 거리는 km 단위 (예 : 1.5km, 08km)*/

        String bus_number = "상암08";
        int remaining_time = 3;
        float remaining_distance = 1.2f;
        System.out.println(bus_number + "번 버스");
        System.out.println("약 " + remaining_time + "분 후 도착");
        System.out.println("남은 거리 " + remaining_distance + "km");


    }
}
