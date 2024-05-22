package zy2;

public class Rectangle extends Shape{
	double length;
	double width;
	public void calculateArea(){
		double area=length*width;
		System.out.println(name+"形状的面积为"+area);
	}
	public void calculatePerimeter(){
		double perimeter=2*(length+width);
		System.out.println(name+"形状的周长为"+perimeter);
	}
}
