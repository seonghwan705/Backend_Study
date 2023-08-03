package Chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "블랙박스1";
        
        // 전달값과 반환값이 없는 메소드
        b1.autoReport(); // 지원안됨 
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨
        
        // 전달값이 있는 메소드
        b1.insetMemoryCard(256);

        // 전달값과 반환값이 있는 메소드
        // 일반 영상 : 1
        // 이벤트 영상 (충돌을 감지한 영상) : 2
        int fileCount = b1.getVideoFileCount(1); // 일반 영상
        System.out.println("일반 영상 파일 수 : "+fileCount+"개");

        fileCount = b1.getVideoFileCount(2); // 이벤트 영상
        System.out.println("이벤트 영상 파일 수 : "+fileCount+"개");
    }
}
