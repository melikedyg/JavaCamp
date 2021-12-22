
public class Instructor extends User{
	
	
	private String instructorsTrainings;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String eMail,
			String instructorsTrainings) {
		super(id, firstName, lastName, eMail);
		
		this.instructorsTrainings=instructorsTrainings;
	}
	
	
	public String getInstructorsTrainings() {
		return instructorsTrainings;
	}
	public void setInstructorsTrainings(String instructorsTrainings) {
		instructorsTrainings = instructorsTrainings;
	}
	
	
	


}
