package tests;

import java.util.ArrayList;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.Student;
import entities.Professor;
import entities.School;
import entities.House;

public class HouseTest {
	House Ravenclaw;
	
	@Test
	public void studentsTest() 
	{
		Ravenclaw = new House("Ravenclaw");
		Vector<Student> students = new Vector<Student>();
		Student temp = new Student("Harry Potter");
		students.add(temp);
		Ravenclaw.setStudents(students);
		
		Vector<Student> actual = Ravenclaw.getStudents();
		
		for(Student x:actual)
		{
			System.out.println(x.getName());			
		}
		
	}
	
	@Test
	public void qualitiesTest() 
	{
		House _Ravenclaw = new House("Ravenclaw");
		
		ArrayList<String> qual = new ArrayList<String>();
		String temp = new String("Harry Potter");
		qual.add(temp);
		
		_Ravenclaw.setQualities(qual);
		
		ArrayList<String> actual = _Ravenclaw.getQualities();
		
		for(String x:actual)
		{
			System.out.println(x);			
		}
		
	}
	
	@Test
	public void getAndSetSchoolTest()
	{
		House _Ravenclaw = new House("Ravenclaw");
		
		School school = new School("Hogwarts");
		_Ravenclaw.setSchool(school);
		School actual = _Ravenclaw.getSchool();
	
		System.out.println(actual.getName());
		
	}

	@Test
	public void getAndSetProfessorTest() {
		
		House _Ravenclaw = new House("Ravenclaw");
		
		Professor prof = new Professor("Madame Hooch");
		_Ravenclaw.setHeadTeacher(prof);
		Professor actual = _Ravenclaw.getHeadTeacher();
		System.out.println(actual.getName());			

	}
	
	
	@Test
	public void getAndSetNameTest()
	{
		House _Ravenclaw = new House("Ravenclaw");
		
		_Ravenclaw.setName("Ravenclaw");
		String actual = _Ravenclaw.getName();
		String expected = "Ravenclaw";
		
		Assert.assertEquals(expected, actual);
	}
	
}

