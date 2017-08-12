package entities;

import java.util.Vector;

public class Course 
{
	private String name;
	private Professor professorName;
	private Vector<Student> studentNames;
	private Grade minGrade;
	private int year;

	// Constructors
	
	
	
	public Course(String _name)
	{	
		name = _name;
		professorName = null;
		minGrade = Grade.O;
		year = 1996;
		studentNames = null;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", professorName=" + professorName + ", studentNames=" + studentNames
				+ ", minGrade=" + minGrade + ", year=" + year + "]";
	}

	public Course(String _name, Professor _professorName, Grade _minGrade, int _year)
	{	
		name = _name;
		professorName = _professorName;
		minGrade = _minGrade;
		year = _year;
		studentNames = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Professor getProfessorName() {
		return professorName;
	}

	public void setProfessorName(Professor professorName) {
		this.professorName = professorName;
	}

	public Vector<Student> getStudentNames() {
		return studentNames;
	}

	public void setStudentNames(Vector<Student> studentNames) {
		this.studentNames = studentNames;
	}

	public Grade getMinGrade() {
		return minGrade;
	}

	public void setMinGrade(Grade minGrade) {
		this.minGrade = minGrade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

	
}
