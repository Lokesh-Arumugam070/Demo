package collections;
import java.util.ArrayList;

public class Studentimplementation{
	public static void main(String[] args) {
		Student student1=new Student(1,"John");
		Student student2=new Student(2,"Mohan");
		Student student3=new Student(3,"Surya");
		Student student4=new Student(4,"Mike");
		ArrayList<Student>students=new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
//		for (int i = 0; i < students.size(); i++) {
//			Student s=students.get(i);
//			System.out.println(s.getId()+" "+s.getName());
//			
//		}
		for (Student student : students) {
			
			System.out.println(student.getId()+ " "+student.getName());
		}
		
		
	}

}
