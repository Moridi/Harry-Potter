package tests;

import java.util.Vector;

import org.junit.Test;

import entities.FinishedCourse;
import entities.Student;
import entities.Course;

public class StudentTest {
	Student harry;

	@Test
	public void coursesTest() 
	{
		Course course = new Course("flying");
		Vector<Course> courses = new Vector<Course>();
		courses.add(course);
		Student harryPotter = new Student ("Harry Potter");
		harryPotter.setCourses(courses);
		
		Vector<Course> actual = harryPotter.getCourses();	
		
		for(Course x: actual)
		{
//			System.out.println(x.getName());
		}
		
	}

	@Test
	public void getNameTest() {
		Student student = new Student("Harry Potter");
		
		String actual = student.getName();
//		System.out.println(actual);	
	}
	
	@Test
	public void getAndSetReportCardTest() {
		Vector<FinishedCourse> courses = new Vector<FinishedCourse> ();
		courses.add(new FinishedCourse("Flying"));
		Student harryPotter = new Student ("Harry Potter");
		harryPotter.setReportCard(courses);
		Vector<FinishedCourse> actual = harryPotter.getReportCard();
		
		for(FinishedCourse x:actual)
		{
//			System.out.println(x.toString());			
		}
	}
}

