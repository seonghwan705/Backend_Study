package Chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.callservicecenter();

        BlackBox b2 = new BlackBox();
        b2.callservicecenter();

        BlackBox.callservicecenter();

        String  s =String.valueOf(3);
    }
}
