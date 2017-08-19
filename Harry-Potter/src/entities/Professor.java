package entities;

import java.util.Map;

public class Professor extends Person{
	
	private Map<Integer, Course> courses;
	private String notes;
	
	// Constructors
	
	
	public Professor(String _name, House _houseName, BloodStatus _bloodStatus,
			School _school, String _birthday, Map<Integer, Course> courses, String notes) {
		super(_name, _houseName, _bloodStatus, _school, _birthday);
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
		return "Professor [person=" + super.toString() + ", notes=" + notes + "]";
	}

	//Setters and getters
	
	public Map<Integer, Course> getCourses() {
		return courses;
	}
	public void setCourses(Map<Integer, Course> _courses) {
		courses = _courses;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String _notes) {
		notes = _notes;
	}
	
	
}
