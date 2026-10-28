package com.languagefundamentals.methods;

class Student {
	int sid;
	String sname;
	int age;
}

public class TestmethodsDemo3 {

	void main(String[] args) {
		System.out.println("main method started ");

		Student student = getStudent();
		
		getStudent1Info(student);

		System.out.println(student.sid);
		System.out.println(student.age);
		System.out.println(student.sname);

		System.out.println("main method ended ");
	}

	
	void getStudent1Info(Student s){
		System.out.println("student1 info ");
		System.out.println(s.sid);
		System.out.println(s.age);
		System.out.println(s.sname);
		
		System.out.println("student1 info ended");
	}
	
	//Factory method
	Student getStudent() {
		System.out.println("student info ");
		Student s = new Student();// Address of the Object
		
		s.sid = 101;
		s.age = 21;
		s.sname = "Yashwanth";

		System.out.println("student info ended ");
		return s;
	}

}
