package entities;

import java.util.Map;

public class Professor extends Person{
	
	private Map<Integer, Course> courses;
	private String notes;
	
	public Professor(String _name, Map<Integer, Course> courses, String notes) {
		super(_name);
		this.courses = courses;
		this.notes = notes;
	}
	
	public Professor(String _name) {
		super(_name);
		this.courses = null;
		this.notes = null;
	}
	
	
	@Override
	public String toString() {
		return "Professor [courses=" + courses + ", notes=" + notes + "]";
	}

	public Map<Integer, Course> getCourses() {
		return courses;
	}
	public void setCourses(Map<Integer, Course> courses) {
		this.courses = courses;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}