package Chap_07;

import Chap_07.Camera.ActionCam;
import Chap_07.Camera.SlowActionCam;

public class _17_Final { // final 붙이면 값 변경이 불가능!!!!
    public static void main(String[] args) {
        // Final
        // public (final) class : 클래스 생성
        // public (final) void : 메소드 (반환값 없는 메소드)
        // public (final) 클래스명 : 생성자
        // public > abstract > static > final > ...


        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();
        System.out.println("----------------------");
        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makevideo();

    }
}
