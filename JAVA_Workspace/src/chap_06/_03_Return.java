package chap_06;

public class _03_Return {
    // void는 반환값이 없는 메소드, 반환값이 있는 경우는 반환할 자료형을 void 자리에 적기

    // 호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNumer="02-1234-5678";
        return phoneNumer;
    }
    // 호텔 주소
    public static String getHotelAdress(){
        return "서울시 강남구";
    }
    // 호텔 액티비티 활동
    public static String getActivity(){
        return "볼링장, 탁구장, 헬스장, 수영장, 노래방";
    }



    public static void main(String[] args) {

        // 반환값, Return

        String contectNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : "+contectNumber);

        String adress = getHotelAdress();
        System.out.println("호텔 주소 : "+adress);

        System.out.println("호텔 액티비티 : "+getActivity());

    }
}
