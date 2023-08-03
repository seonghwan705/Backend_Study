package Chap_07;

import Chap_07.Camera.FactoryCam;
import Chap_07.Camera.SpeedCam;

public class _15_Super {  // 부모 클래스 호출하는 것!
    public static void main(String[] args) {
        // Super
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("------------------");
        speedCam.takePicture();
    }
}
