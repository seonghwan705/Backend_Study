package Chap_07.Camera;

public final class ActionCam extends Camera { // final : 클래스 자체를 상속할 수가 없음
    public final String lens; // final : 값 고정
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; // 생성자 내에서 간접 초기화 가능!
    }
    public final void makeVideo(){  // final : 값고정, 자식에서 오버라이딩 불가
        System.out.println(this.name+" : " + this.lens+"로 촬영한 멋진 비디오를 제작합니다.");
    }
}
