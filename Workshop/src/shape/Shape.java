package shape;

public abstract class Shape {
	private int width;		// 가로길이
	private int height;		// 세로길이
	private String colors;	// 색상
	
	public abstract double getArea(); // 추상메서드 : 도형의 넓이를 리턴
	
	public Shape() {}

	public Shape(int width, int height, String colors) {
		this.width = width;
		this.height = height;
		this.colors = colors;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}
	
	

}
