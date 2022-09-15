import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<Student>();								// Creating list of type Student
		
		// Adding Elements to List std
		std.add(new Student(5,"Ishan",19,49));
		std.add(new Student(10,"Radha",20,65));
		std.add(new Student(8,"Monty",18,82));
		std.add(new Student(7,"Richa",21,70));
		std.add(new Student(12,"Sommya",19,69));
		std.add(new Student(21,"Ignesh",21,94));
		std.add(new Student(1,"Ravi",20,80));
	
		// Creating a List of type marks to add all the marks of students
		List<Float> marks = new ArrayList<Float>();
		
		// For each loop 
		for(Student s: std) {
			
			// adding the elements to marks List according to condition
			if(s.marks>=60 && s.marks<=80)
				marks.add(s.marks);
		}
		
		// Print the marks between 60-80
		System.out.println(marks);
	
	}

}
