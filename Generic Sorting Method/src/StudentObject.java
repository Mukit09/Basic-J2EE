
public class StudentObject implements Comparator<Student> {
	
	@Override
	public int compareTo(Student student1, Student student2){
		
		return student1.name.length()-student2.name.length();
	}

}
