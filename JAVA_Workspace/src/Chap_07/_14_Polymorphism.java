package Chap_07;

import Chap_07.Camera.Camera;
import Chap_07.Camera.FactoryCam;
import Chap_07.Camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성 : 상속 부모는 자식과 is-a 관계
        // 자식은 부모일 수 있으나, 부모는 자식이 아니다.

        // class Person : 사람
        // class Student extends Person : 학생 (student is a person)
        // class Teacher extends Person : 선생님 (teacher is a person)

        Camera camera = new Camera();
        Camera factorycam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factorycam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }
        System.out.println("-------------------");

        // factorycam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recognizeLicensePlate();
        // 자식을 부모클래스로 정의했기 때문에 자식 클래스의 메소드 사용불가

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }
        if(factorycam instanceof FactoryCam) {
            ((FactoryCam)factorycam).detectFire();
        }
        if (speedCam instanceof SpeedCam){
            ((SpeedCam) speedCam).checkSpeed();
        }
    }
}