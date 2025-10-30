package laba9_zad2;

import java.util.List;
import java.util.Iterator;
public class StudentUtils {

    public static void processStudents(List<Student> students) {
	Iterator<Student>iterator = students.iterator();
	while(iterator.hasNext()) {
	    Student s = iterator.next();
	    if(s.getAverage() < 3.0) {
		iterator.remove();
	    }
	    else {
		s.setCourse(s.getCourse()+1);
	    }
	}
    }
    
    
    public static void printStudents(List<Student> students,int course) {
	System.out.println("Студент на курс" + course);
	
	for(Student s : students) {
	    if(s.getCourse()==course) {
		System.out.println("-"+s.getName());
	    }
	}
    }
}
