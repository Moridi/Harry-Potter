package entities;

import java.util.Vector;


public class Student extends Person{

	private Vector<Course> courses;
	private Vector<FinishedCourse> reportCard;
	
	// Constructors
	
	
	public Student(String _name, House _houseName, BloodStatus _bloodStatus,
			School _school, String _birthday, Vector<Course> _courses) {
		super(_name, _houseName, _bloodStatus, _school, _birthday);
		courses = _courses;
	}
	
	public Student(String _name){
		super(_name);
		courses = null;
		reportCard = null;
	}
	
	public Student(){
		this(null);
	}
	
	@Override
	public String toString() {
		return "Student [Person=" + super.toString() + ", courses=" + courses.size()  + "]";
	}

	//Setters and getters
	
	public Vector<Course> getCourses() {
		return courses;
	}

	public void setCourses(Vector<Course> _courses) {
		courses = _courses;
	}
	public Vector<FinishedCourse> getReportCard() {
		return reportCard;
	}
	public void setReportCard(Vector<FinishedCourse> _reportCard) {
		reportCard = _reportCard;
	}
	
}
