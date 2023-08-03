package Chap_07;

public class BlackBoxRefurbish {
    public String modelName; // 모든 클래스에서
    String resolution; // 같은 패키지 내에서, default
    private int price; // 해당 클래스 내에서
    protected String color; // 같은 패키지 내에서, 다른 패키지의 경우 자식클래스에서 접근

    // 상단 Code 메뉴, Generater.., Getter & Setter 자동 만들기, shift : 다중 선택
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if(resolution==null||resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price<100000){
            this.price=100000;
        }
        else {
            this.price=price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
