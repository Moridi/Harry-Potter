package service;

import entities.*;

import java.util.Vector;
import java.io.*;

public class CourseService {
		private Course course;//The course the services are performed on/at
		private Vector<Course> allCourses;//All the courses in the system

		
		public CourseService(Course _course) {
			course = _course;
			allCourses = new Vector<Course>();
		}
		
		public CourseService() {
			this(null);
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
	        	if(s.equals("$")){
	        		break;
	        	}
	        	String courseName = s;
	        	
	        	String _minGrade = br.readLine();
	        	Grade minGrade = Grade.valueOf(_minGrade);
	        	
	        	String professorName = br.readLine();
	        	Professor professor = new Professor(professorName);
	        	
	        	String _year = br.readLine();
	        	int year = Integer.parseInt(_year); 
	        			
	        	String numberOfStudents = br.readLine();
	        	int numOfStudents = Integer.parseInt(numberOfStudents);
	        	
	        	Vector<Student> students = new Vector<Student>();
	        	
	        	for(int i = 0; i < numOfStudents; i++){
	        		String studentName = br.readLine();
	        		students.add(new Student(studentName));    		
	        	}
	        	
	        	Course newCourse = new Course(courseName, professor, minGrade, year);
	        	
	        	newCourse.setStudentNames(students);
	        	
	        	allCourses.add(newCourse);
	        		    
	        	s = br.readLine();	
	        }  
	        freader.close(); 
		}
		

		public void setData() throws FileNotFoundException, UnsupportedEncodingException/* implement this method so you can fill
		your database using the vector of courses you have */
		{
			PrintWriter writer = new PrintWriter("CourseDB.txt", "UTF-8");
			for(Course x: allCourses)
			{			
				writer.println(x.getName());
				writer.println(x.getMinGrade().toString());
				writer.println(x.getProfessorName().getName());
				writer.println(x.getYear());

				writer.println(x.getStudentNames().size());
				
				for(Student student: x.getStudentNames()){
					writer.println(student.getName());
				}
				writer.println("*");
			}
			writer.println("$");
			writer.close();
		}
		
}
