package zy2;

public class Circle extends Shape{
	double radius;
	public void calculateArea(){
		double area=radius*radius*3.14;
		System.out.println(name+"形状的面积为"+area);
	}
	public void calculatePerimeter(){
		double perimeter=2*3.14*radius;
		System.out.println(name+"形状的周长为"+perimeter);
	}
}
