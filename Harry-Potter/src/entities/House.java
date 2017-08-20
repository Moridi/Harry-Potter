package entities;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Map;

public class House {
	private String name;
	private School school;
	private Vector<Student> students;
	private Professor HeadTeacher;
	private ArrayList<String> qualities;
	private Map<Integer, Student> prefects;
	
	// Constructors
	
	
	public House(String _name, School _school, Vector<Student> _students) {
		name = _name;
		school = _school;
		students = _students;
	}
	
	public House(String _name, School _school, Vector<Student> _students, Professor _headTeacher,
			ArrayList<String> _qualities, Map<Integer, Student> _prefects) {
		name = _name;
		school = _school;
		students = _students;
		HeadTeacher = _headTeacher;
		qualities = _qualities;
		prefects = _prefects;
	}

	public House(String _name)
	{
		this(_name, null, null, null, null, null);
	}	
	
	public House()
	{
		this(null, null, null, null, null, null);
	}	
	
	@Override
	public String toString() {
		return "House [name=" + name + ", school=" + school.getName() + "]";
	}


	//Setters and getters
	
	public String getName() {
		return name;
	}
	public void setName(String _name) {
		name = _name;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School _school) {
		school = _school;
	}
	public Vector<Student> getStudents() {
		return students;
	}
	public void setStudents(Vector<Student> _students) {
		students = _students;
	}
	public Professor getHeadTeacher() {
		return HeadTeacher;
	}
	public void setHeadTeacher(Professor _headTeacher) {
		HeadTeacher = _headTeacher;
	}
	public ArrayList<String> getQualities() {
		return qualities;
	}
	public void setQualities(ArrayList<String> _qualities) {
		qualities = _qualities;
	}
	public Map<Integer, Student> getPrefects() {
		return prefects;
	}
	public void setPrefects(Map<Integer, Student> _prefects) {
		prefects = _prefects;
	}
}
