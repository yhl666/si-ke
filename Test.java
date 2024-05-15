package zy1;

public class Test {
	public static void main(String[] args) {
		// 创建存储学生对象的数组
		Student stu[] = new Student[3];

		// 新建3个学生对象
		Student s1 = new Student(1, "张三", 18);
		Student s2=new Student(2,"李四",19);
		//Student s3 = new Student(3, "王五", 20);

		// 把学生对象存到数组里面去
		stu[0] = s1;
		stu[1]=s2;
		//stu[2] = s3;

		// 创建自己的学生信息
		Student s4 = new Student(4, "wq", 18);

		// 插入学生信息
		// 首先进行学号唯一性的判断
		boolean flag = contains(stu, s4.getId());

		if (flag) {
			System.out.println("插入学生信息失败");
		} else {
			int count = getCount(stu);
			// 数组满了的情况下，进行插入的方法
			if (count == stu.length) {
				Student newStu[];
				newStu = createNewArr(stu);
				newStu[count] = s4;
				stu = newStu;
				System.out.println("(1)数组满了的情况下，插入学生信息成功");
			}
			// 数组没满的情况下，进行插入的方法
			if (count < stu.length) {
				for (int i = 0; i < stu.length; i++) {
					if (stu[i] == null) {
						stu[i] = s4;
						System.out.println("(1)数组未满的情况下，插入学生信息成功");
						break;
					}
				}
			}

		}

		// 打印数组的信息
		System.out.println("(2)打印学生信息");
		printStu(stu);

		// 删除学生信息
		if (getIndex(stu, 3) >= 0) {
			stu[getIndex(stu, 3)] = null;
			System.out.println("（3）删除学生信息成功");
		} else {
			System.out.println("（3）删除学生信息失败");
		}

		// 打印删除以后的学生信息
		System.out.println("(4)打印学生信息");
		printStu(stu);

	}

	// 创建新数组
	public static Student[] createNewArr(Student stu[]) {
		Student newStu[] = new Student[stu.length + 1];

		for (int i = 0; i < stu.length; i++) {
			newStu[i] = stu[i];
		}

		return newStu;
	}

	// 判定学号的唯一性
	public static boolean contains(Student stu[], int id) {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				if (stu[i].getId() == id) {
					System.out.println("学号重复");
					return true;
				}
			}
		}
		return false;
	}

	// 计算数组里面存的元素的个数
	public static int getCount(Student stu[]) {
		int count = 0;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				count++;
			}
		}

		return count;
	}

	// 遍历学生的信息
	public static void printStu(Student stu[]) {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				System.out.println(stu[i].getId() + "," + stu[i].getName() + "," + stu[i].getAge());
			}
		}
	}

	// 找对应学号学生信息在数组里面的下标
	public static int getIndex(Student stu[], int id) {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				int sid = stu[i].getId();
				if (sid == id)
					return i;
			}
		}

		return -1;
	}

}
