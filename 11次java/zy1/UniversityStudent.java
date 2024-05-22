package zy1;

public class UniversityStudent extends Student{
	int grade;
	String major;
	public void bigIntroduce(){
		System.out.println("大家好，我的学号"+id+"，名字是"+name
				+"，年龄是"+age+"岁。我是"+grade+"级"+major+"专业的学生。");
	}
	
}
