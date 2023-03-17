package chap2.quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동", 30);
		stu.setStudentId("a001");
		
		Teacher t = new Teacher("김철수", 50);
		t.setSubject("수학");
		
		Employee emp = new Employee("박영희", 25);
		emp.setDepartment("영업부");
		
		stu.info();
		t.info();
		emp.info();

	}

}













