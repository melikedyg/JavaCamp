
public class StudentManager extends UserManager{
	@Override
	public void add(User student) {
		System.out.println( student.firstName +" "+  student.lastName +" enrolled in "+ student.course+" course ");
		

}
}