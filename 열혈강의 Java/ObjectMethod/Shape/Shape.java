package ObjectMethod.Shape;

public class Shape {
	private char type;
	private int width;
	private int height;
	
	public Shape(char type, int width, int height) {
		this.type = type;
		this.width = width;
		this.height = height;
	}
	public float getArea() {
		float area = 0F;
		
		if(type == 'T') {
			area = (width * height)/(float)2;
		}
		return area;
	}
}
