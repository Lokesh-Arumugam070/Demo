package arraylist;
import java.util.*;
public class Studentimplementation {
	public static void main(String[] args) {
		Subject s1=new Subject(1,"Maths",70);
		Subject s2=new Subject(2,"English",80);
		Subject s3=new Subject(3,"Tamil",90);
		List<Subject>subjectlist1=new ArrayList<Subject>();
		subjectlist1.add(s1);
		subjectlist1.add(s2);
		subjectlist1.add(s3);
		Student student1=new Student(1,"Lokesh",subjectlist1);
		
		Subject s4=new Subject(1,"Maths",50);
		Subject s5=new Subject(2,"English",60);
		Subject s6=new Subject(3,"Tamil",95);
		List<Subject>subjectlist2=new ArrayList<Subject>();
		subjectlist2.add(s4);
		subjectlist2.add(s5);
		subjectlist2.add(s6);
		Student student2=new Student(2,"Rakesh",subjectlist2);
		
		
		Subject s7=new Subject(1,"Maths",40);
		Subject s8=new Subject(2,"English",90);
		Subject s9=new Subject(3,"Tamil",85);
		List<Subject>subjectlist3=new ArrayList<Subject>();
		subjectlist3.add(s7);
		subjectlist3.add(s8);
		subjectlist3.add(s9);
		Student student3=new Student(1,"Vignesh",subjectlist3);
		
		
		List<Student>students=new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		for (Student studentdetails : students) {
			int studentID=studentdetails.getId();
			String name=studentdetails.getName();
			List<Subject>studentsubject=studentdetails.getSubjects();
			int total=0;
			
			for (int i = 0; i < studentsubject.size(); i++) {
				
				Subject subject=studentsubject.get(i);
				total=total+subject.getMarks();
				
			}
			
			System.out.println(" ID "+studentID+" Name "+name+" Total "+total);
		}
		
	}

}
