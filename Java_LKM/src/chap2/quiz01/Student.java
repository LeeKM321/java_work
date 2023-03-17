package chap2.quiz01;

public class Student extends Person {

	private String studentId;
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
	@Override
	public void info() {
		super.info();
		System.out.printf("학번: %s\n", studentId);
	}

}










