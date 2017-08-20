package entities;

public class FinishedCourse extends Course{
	private Grade grade;
	private boolean passed;
	
	
	@Override
	public String toString() {
		return "FinishedCourse [grade=" + grade + ", passed=" + passed + "]";
	}

	// Constructors
	
	
	public FinishedCourse(String _name, Grade _grade, boolean _passed) {
		super(_name);
		grade = _grade;
		passed = _passed;
	}
	
	
	//Setters and getters
	
	public FinishedCourse(String _name){
		super(_name);
		grade = null;
		passed = false;
	}
	
	public FinishedCourse(){
		this(null);
	}
	
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade _grade) {
		grade = _grade;
	}
	public boolean isPassed() {
		return passed;
	}
	public void setPassed(boolean _passed) {
		passed = _passed;
	}
	
	
}
