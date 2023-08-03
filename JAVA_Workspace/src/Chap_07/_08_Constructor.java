package Chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1=new BlackBox(); // 객체 생성
        b1.modelName="블랙박스1";
        b1.resolution="FHD";
        b1.price=200000;
        b1.color="블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        System.out.println("-----------------------");

        BlackBox b2=new BlackBox("블랙박스2","UHD",300000,"화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
    }
}
