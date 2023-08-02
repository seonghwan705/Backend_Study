package shape;

public class Triangle extends Shape implements Resize {

	@Override
	public void setResize(int size) { // 도형의 사이즈를 변경
		
		int setsize = getHeight() + size; 
		setHeight(setsize);
	}
	
	@Override
	public double getArea() { // 도형의 넓이를 리턴 
		double area = (double)(getHeight() * getWidth()/2);
		return area;
	}
	

	public Triangle() {}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);}

	
	
	
	


}
