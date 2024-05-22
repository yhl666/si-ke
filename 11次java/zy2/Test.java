package zy2;

public class Test {
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.name="Ô²ÐÎ";
		circle.radius=2;
		circle.calculateArea();
		circle.calculatePerimeter();
		Rectangle rectangle=new Rectangle();
		rectangle.name="¾ØÐÎ";
		rectangle.length=2;
		rectangle.width=3;
		rectangle.calculateArea();
		rectangle.calculatePerimeter();
	}
}
