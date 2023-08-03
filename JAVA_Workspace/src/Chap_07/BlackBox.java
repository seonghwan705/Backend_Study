package Chap_07;

public class BlackBox {
   String modelName;
   String resolution;
   int price;
   String color;
   int serialNumber;

   static boolean canAutoReport = false; // 자동신고기능, static붙이면 클래스변수
    // 해당 BlackBox 클래스로 인해 만들어진 객체는 모두 이 클래스변수를 적용

   static int counter=0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가, ++연산을 통해서 값을 증가)


   BlackBox(){   // 생성자, 객체가 생성될 때 자동으로 호출되는 메소드
//      System.out.println("생성자1 : 기본 생성자");
//      this.serialNumber=++counter;
//      System.out.println("새로운 시리얼 넘버를 발급받았습니다 : "+this.serialNumber);
   }

   BlackBox(String modelName, String resolution, int price, String color){
//      this();  // 기본 생성자를 호출
//      System.out.println("생성자2 : 사용자 정의 생성자 호출");
//      this.modelName = modelName;
//      this.resolution = resolution;
//      this.price=price;
//      this.color=color;
   }

   void autoReport(){   // 메소드1
      if (canAutoReport){
         System.out.println("충돌이 감지되어 자동으로 신고합니다.");
      }
      else {
         System.out.println("자동 신고 기능이 지원되지 않습니다.");
      }
   }
   void insetMemoryCard(int capacity){    // 메소드2 : void는 반환값X
      System.out.println("메모리 카드가 삽입되었습니다.");
      System.out.println("용량은 "+capacity+"GB입니다.");
   }
   int getVideoFileCount(int type){
      if (type==1){
         return 9;
      } else if (type==2) { // 이벤트 영상
         return 1;
      }
      return 10;
   }

   // showdatetime : 날짜정보 표시여부
   // showspeed : 속도정보 표시여부
   // min : 영상 기록 단위(분)
   void record(boolean showDateTime, boolean showSpeed, int min){
      System.out.println("녹화를 시작합니다.");
      if (showDateTime){
         System.out.println("영상에 날짜정보가 표시됩니다.");
      }
      if (showSpeed){
         System.out.println("영상에 속도정보가 표시됩니다.");
      }
      System.out.println("영상은 "+min+"분 단위로 기록됩니다.");
   }
   void record(){  // 메소드 오버로딩 안에 동일 메소드 호출하는 코드
      record(true,true,5);
   }

   static void callservicecenter(){
      System.out.println("서비스 센터(1588-0000)로 연결합니다.");
      canAutoReport = false;
      // 1. static으로 선언한 클래스변수는 static메소드에서 사용가능
      // 2. 인스턴스 변수는 static 메소드에서 사용불가

      // 메소드 변수의 종류 : 지역변수, 인스턴스 변수, 클래스 변수
      // [ 인스턴스 메소드 ]
      // 객체마다 서로 다른 동작가능, 객체가 생성되어야 메모리가 할당되는 변수
      // [ 클래스 메소드 ]
      // 객체가 만들어지지 않고도 접근가능
   }

   void appendModelName(String modelName) {
      this.modelName+=modelName;
      // this로 BlackBox 클래스의 인스턴스 변수 modelName임을 표시
   }

   // Getter & Setter
   // 1. Getter : 값을 가져오는 메소드
   // 2. Stter : 값을 설정하는 메소드
   String getModelName(){ // 이게 Getter
      return modelName;
   }
   void setModelName(String modelName){ // Setter
      this.modelName=modelName;
   }

   // 해상도의 getter와 setter
   String getResolution(){
      if(resolution==null||resolution.isEmpty()) {
         return "판매자에게 문의하세요.";
      }
      return resolution;
   }

   void setResolution(String resolution){
      this.resolution=resolution;
   }

   // 가격의 getter 와 setter
   int getPrice(){
      return price;
   }
   void setPrice(int price){
      if (price<100000){
         this.price=100000; // 최소 기본값 설정
      }
      else {
         this.price=price;
      }
   }

   // 색상의 getter 와 setter
   String getColor(){
      return color;
   }
   void setColor(String color){
      this.color=color;
   }
}

