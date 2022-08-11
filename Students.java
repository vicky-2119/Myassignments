package week4.day2Assingments;

public class Students {
	public void getStudentsDetails(int id) {
		System.out.println(id);
	}
	public void getStudentsDetails(String name) {
		System.out.println(name);
	}
	public void getStudentDetails(String email) {
		System.out.println(email);
	}
    public void getStudentsDetails(long phoneNumber) {
    	System.out.println(phoneNumber);
     }
    public void getStudentDetails(String name ,long phoneNumber) {
    	System.out.println(name+"  "+phoneNumber);
    	 }
    public void getStudentDetails(int id,String email) {
    	System.out.println(id+ "  "+email);
    }
    public void getStudentDetails(long phoneNumber,int id) {
    	System.out.println(phoneNumber+id);
    }
    
    public static void main(String[] args) {
		Students stud=new Students();
		stud.getStudentsDetails(89);
		stud.getStudentsDetails("Bharath");
		stud.getStudentDetails("bharth07gmail.com");
		stud.getStudentsDetails(9087291617L);
		stud.getStudentDetails("Bharath", 9087291617L);
		stud.getStudentDetails(89,"bharth07gmail.com");
		stud.getStudentDetails(9087291617L, 89);
    }
}
