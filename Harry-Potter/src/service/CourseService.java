package service;

import entities.Course;

import java.util.Vector;
import java.io.*;

public class CourseService {
		private Course course;//The course the services are performed on/at
		private Vector<Course> allCourses;//All the courses in the system

		
		public void getData(String fileName) throws IOException
		/* implement this method such that you will
		receive the file name (courseDB.txt) as an input and inside the method you
		will open that file, read it and will fill up the information for each course (fill the
		vector)*/
		{
	        FileReader freader = new FileReader(fileName);  
	        BufferedReader br = new BufferedReader(freader);  
	        String s;  
	        while((s = br.readLine()) != null) {  
	        System.out.println(s);  
	        }  
	        freader.close(); 
		}
		
		public void setData()/* implement this method so you can fill
		your database using the vector of courses you have */
		{
			
		}
		
		public CourseService(Course course) {
			this.course = course;
		}

		public Course getCourse() {
			return course;
		}

		public void setCourse(Course _course) {
			course = _course;
		}

		public Vector<Course> getAllCourses() {
			return allCourses;
		}

		public void setAllCourses(Vector<Course> _allCourses) {
			allCourses = _allCourses;
		}
		
		
}
