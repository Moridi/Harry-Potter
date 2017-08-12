package entities;

public class FinishedCourse extends Course{
	private Grade grade;
	private boolean passed;
	
	
	@Override
	public String toString() {
		return "FinishedCourse [grade=" + grade + ", passed=" + passed + "]";
	}

	public FinishedCourse(String _name, Grade grade, boolean passed) {
		super(_name);
		this.grade = grade;
		this.passed = passed;
	}
	
	public FinishedCourse(String _name){
		super(_name);
		this.grade = null;
		this.passed = false;
	}
	
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public boolean isPassed() {
		return passed;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	
	
}
