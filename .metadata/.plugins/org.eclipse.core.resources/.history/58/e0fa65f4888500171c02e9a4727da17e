package seviceTest;

import java.io.IOException;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.*;
import service.*;

	public class SchoolServiceTest {

		@Test
		
		public void constructorTest() {	
			School gryff = new School("Gryffindor");
			SchoolService schoolServe = new SchoolService(gryff);
			String actual = schoolServe.getSchool().getName();
			String expected = "Gryffindor";
			Assert.assertEquals(expected, actual);	
			
		}	
		@Test
		public void questionsTest() {
			School gryff = new School("Gryffindor");
			SchoolService schoolServe = new SchoolService(gryff);
			
			Student harry = new Student("Harry Potter");
			House house = schoolServe.sortintHat(harry); //Slytherin
			
			String actual = house.getName();
			String expected = "Slytherin";
			Assert.assertEquals(expected, actual);	
		}
		
		@Test
		public void getSchoolDataTest() throws IOException{
			School gryf = new School("Gryffindor");
			SchoolService gryff = new SchoolService(gryf);
			gryff.getData("SchoolDB.txt");
			Vector<School> allSchools = gryff.getAllSchools();
			String actual = allSchools.get(0).toString();
			String expected = "School [name=Hogwarts, numOfStudents=3, houseNames=4, studentNames=3, professorNames=2, courseNames=2, location=England]";

			Assert.assertEquals(expected, actual);	
		}
}
