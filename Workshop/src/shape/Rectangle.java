package shape;

public class Rectangle extends Shape implements Resize {

	@Override
	public void setResize(int size) { // 도형의 사이즈를 변경
		int setsize = getWidth() + size; 
		setWidth(setsize);
	}

	@Override
	public double getArea() { // 도형의 넓이를 리턴
		double area = (double)(getHeight() * getWidth());
		return area;
	}

	public Rectangle() {}
	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);}
	
	
	

}
