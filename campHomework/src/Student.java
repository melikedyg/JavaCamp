
public class Student extends User{
	private String courseCompletionRate;
	
    
	public Student() {
		
	}
	public Student(int id, String firstName, String lastName, String eMail,
			String courseCompletionRate) {
		super(id, firstName, lastName, eMail);
		this.courseCompletionRate=courseCompletionRate;
		
		
	}
	public String  getCourseCompletionRate() {
		return courseCompletionRate;
	}
	public void setCourseCompletionRate(String courseCompletionRate) {
		this.courseCompletionRate = courseCompletionRate;
	}
	



}
