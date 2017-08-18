package service;

import java.util.Vector;

import entities.*;

public class StudentService {
	private Student student;//The school the services are performed on/at
	private Vector<Student> allStudents; //All the students in the system
	
	public void getData(String fileName)/* implement this method such that you will
	receive the file name (schoolDB.txt) as an input and inside the method you
	will open that file, read it and will fill up the information for each course (fill the
	vector)*/
	{
		
	}
	
	public void setData()/* implement this method so you can fill
	your database using the vector of courses you have */
	{
		
	}
	
	public StudentService(Student student) {
		this.student = student;
	}
	
	public void sortToHouse(House house){
		Vector<Student> students = house.getStudents();
		students.add(student);
		house.setStudents(students);
	}
}
