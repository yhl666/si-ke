package zy2;

public class Rectangle extends Shape{
	double length;
	double width;
	public void calculateArea(){
		double area=length*width;
		System.out.println(name+"��״�����Ϊ"+area);
	}
	public void calculatePerimeter(){
		double perimeter=2*(length+width);
		System.out.println(name+"��״���ܳ�Ϊ"+perimeter);
	}
}
