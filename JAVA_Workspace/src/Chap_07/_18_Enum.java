package Chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : 1월, 2월, 3월, 4월
        // 옷사이즈 : S, M, L, XL
        // OS 종류 : win10, win11, macos, linux
        // 해상도 : HD, FHD, QHD, UHD

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution=Resolution.valueOf("UHD");
        System.out.println(resolution);

        System.out.println("----------------------");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name()+" : "+myRes.ordinal()); // 순서
        }
        System.out.println("----------------------");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name()+" : "+myRes.getWidth());

        }
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width){
        this.width=width;
    }
    public int getWidth(){ // getter : 값을 가져오는 메소드
        return width;
    }
}
