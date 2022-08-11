package week4.day2Assingments;

public class Student extends College {
	public void studentName() {
		System.out.println("studentName");
	}
    public void studentDept() {
    	System.out.println("studentDept");
    }
    public void studentId() {
    	System.out.println("studentId");
    }
    public static void main(String[] args) {
		Student stu=new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
	}
}
