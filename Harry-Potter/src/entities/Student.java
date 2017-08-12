package entities;

import java.util.Vector;

public class Student {
	
	private String name;
	private Vector<Course> courses;
	private Vector<FinishedCourse> reportCard;
	
	public Student(String name, Vector<Course> courses, Vector<FinishedCourse> reportCard) {
		this.name = name;
		this.courses = courses;
		this.reportCard = reportCard;
	}
	
	public Student(String name){
		this.name = name;
		this.courses = null;
		this.reportCard = null;
	}
	
	
	@Override
	public String toString() {
		return "Student [courses=" + courses + ", reportCard=" + reportCard + "]";
	}

	public Vector<Course> getCourses() {
		return courses;
	}
	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
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
