package laba9_zad2;

import java.util.List;

public class Student {
private String 	name;
private String group;
private int course;
private List<Integer> grades;

public Student(String name,String group,int course,List<Integer> grades) {
 this.name = name;
 this.group=group;
 this.course = course;
 this.grades = grades;
}

public String getName() {
    return name;
}

public void setCourse(int course) {
    this.course = course;
}
public int getCourse() {
    return course;
}
public double getAverage() {
   int sum = 0;
   for(int grade:grades) {
       sum+=grade;
   }
   return grades.isEmpty()?0.0 :(double) sum/grades.size();
    
    
}
@Override
public String toString() {
    return name + group + "курс"+course +String.format("%.2f", getAverage());
}

}