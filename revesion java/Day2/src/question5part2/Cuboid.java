package question5part2;

import question5part1.Rectangle;

public class Cuboid extends Rectangle{
	
	
	

	

	double height;

	public static void main(String[] args) {
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());


	}

	public Cuboid(double width, double length, double height) {
		super(width, length);
		if(height>0)
		this.height = height;
		else
		this.height=0;
	}

	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return height*getWidth()*getLength();
	}
}
