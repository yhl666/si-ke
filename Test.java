package zy1;

public class Test {
	public static void main(String[] args) {
		// �����洢ѧ�����������
		Student stu[] = new Student[3];

		// �½�3��ѧ������
		Student s1 = new Student(1, "����", 18);
		Student s2=new Student(2,"����",19);
		//Student s3 = new Student(3, "����", 20);

		// ��ѧ������浽��������ȥ
		stu[0] = s1;
		stu[1]=s2;
		//stu[2] = s3;

		// �����Լ���ѧ����Ϣ
		Student s4 = new Student(4, "wq", 18);

		// ����ѧ����Ϣ
		// ���Ƚ���ѧ��Ψһ�Ե��ж�
		boolean flag = contains(stu, s4.getId());

		if (flag) {
			System.out.println("����ѧ����Ϣʧ��");
		} else {
			int count = getCount(stu);
			// �������˵�����£����в���ķ���
			if (count == stu.length) {
				Student newStu[];
				newStu = createNewArr(stu);
				newStu[count] = s4;
				stu = newStu;
				System.out.println("(1)�������˵�����£�����ѧ����Ϣ�ɹ�");
			}
			// ����û��������£����в���ķ���
			if (count < stu.length) {
				for (int i = 0; i < stu.length; i++) {
					if (stu[i] == null) {
						stu[i] = s4;
						System.out.println("(1)����δ��������£�����ѧ����Ϣ�ɹ�");
						break;
					}
				}
			}

		}

		// ��ӡ�������Ϣ
		System.out.println("(2)��ӡѧ����Ϣ");
		printStu(stu);

		// ɾ��ѧ����Ϣ
		if (getIndex(stu, 3) >= 0) {
			stu[getIndex(stu, 3)] = null;
			System.out.println("��3��ɾ��ѧ����Ϣ�ɹ�");
		} else {
			System.out.println("��3��ɾ��ѧ����Ϣʧ��");
		}

		// ��ӡɾ���Ժ��ѧ����Ϣ
		System.out.println("(4)��ӡѧ����Ϣ");
		printStu(stu);

	}

	// ����������
	public static Student[] createNewArr(Student stu[]) {
		Student newStu[] = new Student[stu.length + 1];

		for (int i = 0; i < stu.length; i++) {
			newStu[i] = stu[i];
		}

		return newStu;
	}

	// �ж�ѧ�ŵ�Ψһ��
	public static boolean contains(Student stu[], int id) {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				if (stu[i].getId() == id) {
					System.out.println("ѧ���ظ�");
					return true;
				}
			}
		}
		return false;
	}

	// ��������������Ԫ�صĸ���
	public static int getCount(Student stu[]) {
		int count = 0;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				count++;
			}
		}

		return count;
	}

	// ����ѧ������Ϣ
	public static void printStu(Student stu[]) {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				System.out.println(stu[i].getId() + "," + stu[i].getName() + "," + stu[i].getAge());
			}
		}
	}

	// �Ҷ�Ӧѧ��ѧ����Ϣ������������±�
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
