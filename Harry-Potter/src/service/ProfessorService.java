package service;

import java.util.Vector;

import entities.*;

public class ProfessorService {
	private Professor professor; //The Professor the services are performe on/at
	

	public ProfessorService(Professor professor) {
		this.professor = professor;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	private Vector<Professor> allProfessors; //All the Professors in the system
	
	public void getData(String fileName) /* implement this method such that you will
	receive the file name (professorDB.txt) as an input and inside the method you will
	open that file, read it and will fill up the information for each Professor (fill the
	vector)*/
	{
		
	}

	public void setData()
	/* implement this method so you can fill
	your database using the vector of Professor you have */
	{
		
	}
	public Vector<Professor> getAllProfessors() {
		return allProfessors;
	}

	public void setAllProfessors(Vector<Professor> allProfessors) {
		this.allProfessors = allProfessors;
	}

	
}
