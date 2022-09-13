package question5part1;

public class Rectangle {

	
	double width;
	double length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());

	}

	public Rectangle(double width, double length) {
		super();
		if(width>0)
		this.width = width;
		else
		this.width=0;
		if(length>0)
		this.length = length;
		else
		this.length=0;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getArea() {
		return length*width;
	}

}
