package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1544, "ABDUL"), new Student(234, "stephen"),
				new Student(4, "john"));
		List<Student> stdArrayList=new ArrayList<Student>(students);
		
		
		System.out.println(students);
		Collections.sort(stdArrayList);
		System.out.println(stdArrayList);
	}

}
