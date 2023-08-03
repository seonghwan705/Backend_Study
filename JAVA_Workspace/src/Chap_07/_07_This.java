package Chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName="블랙박스1"; // 블랙박스1 (최신형)
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);


    }
}
