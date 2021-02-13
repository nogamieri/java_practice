class Student {
	String name;
	int age;
}

class Rectangle {
	double width;
	double height;
}
public class Test {

//問題１
	//	public static student printStudentInfo(student s) {
//		String s =
//		System.out.println(nama[s] + age[s]);
//	}

	public static Rectangle getsqure(double d) {
		Rectangle rec = new Rectangle();
		rec.width = d;
		rec.height = d;
		return rec ;
	}

	public static Student getYoungestStudent(Student[] students) {
		Student youngestStudent = students[0];
		for (int i = 1; i < students.length; i++) {
			if (youngestStudent.age > students[i].age) {
				youngestStudent = students[i];
			}
		}
		return youngestStudent;
	}

	public static void main(String args[] ){
		Student[]ss = new Student[3];
		ss[0] = new Student(); ss[0].name = "岩本照"; ss[0].age = 26;
		ss[1] = new Student(); ss[1].name = "ラウール"; ss[1].age = 17;
		ss[2] = new Student(); ss[2].name = "向井康二"; ss[2].age = 25;
		Student s = getYoungestStudent(ss);
		System.out.println(s.name);
		System.out.println(s.age);

		Rectangle a = getsqure(3.0);
		System.out.println(a.width);
		System.out.println(a.height);
	}

}
