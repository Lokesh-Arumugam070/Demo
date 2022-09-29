package arraylist;
import java.util.List;
public class Student {
int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Subject> getSubjects() {
	return subjects;
}
public void setSubjects(List<Subject> subjects) {
	this.subjects = subjects;
}
public Student(int id, String name, List<Subject> subjects) {
	super();
	this.id = id;
	this.name = name;
	this.subjects = subjects;
}
String name;
List<Subject> subjects;
}
