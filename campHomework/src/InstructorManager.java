
public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Added "+user.course+" course by "+user.firstName +" "+ user.lastName );

}
	

}
