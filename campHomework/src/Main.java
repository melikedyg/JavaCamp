
public class Main {

	public static void main(String[] args) {
		

		Student student=new Student();
		student.setId(1);
		student.setFirstName("Zeynep");
		student.setLastName("Özdemir");
		student.seteMail("zeynep22@gmail.com");
		student.course="Java";
		student.setCourseCompletionRate("%20");
		
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.course= "C#";
		instructor.seteMail("engindmrg@gmail.com");
		instructor.setInstructorsTrainings("C#,Java Spring");
		
		UserManager userManager =new UserManager();
		User[] users= {student,instructor};
		userManager.deleteMultiple(users);
		
		UserManager user=new InstructorManager();
		user.add(instructor);
		UserManager user2=new StudentManager();
		user2.add(student);
		
	}

}
