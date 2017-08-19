package service;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import entities.*;

public class ProfessorService {
	private Professor professor; //The Professor the services are performe on/at
	private Vector<Professor> allProfessors; //All the Professors in the system

	public ProfessorService(Professor professor) {
		this.professor = professor;
		allProfessors = new Vector<Professor>();
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void getData(String fileName) throws IOException /* implement this method such that you will
	receive the file name (professorDB.txt) as an input and inside the method you will
	open that file, read it and will fill up the information for each Professor (fill the
	vector)*/
	{
        FileReader freader = new FileReader(fileName);  
        BufferedReader br = new BufferedReader(freader);  
        String s;  
        while((s = br.readLine()) != null) {
        	if(s.equals("$")){
        		break;
        	}
        	String personName = s;
        	
        	String houseName = br.readLine();
        	House house = new House(houseName);
        	
        	String _bloodStatus = br.readLine();
        	BloodStatus bloodStatus = BloodStatus.valueOf(_bloodStatus);
        	
        	String schoolName = br.readLine();
        	School school = new School(schoolName);
        	
        	String birthday = br.readLine();
        	
        	String courseName = br.readLine();
        	Course course = new Course(courseName);
        	
        	String _intPart = br.readLine();
        	int intPart = Integer.parseInt(_intPart);	
        	
        	String notes = br.readLine();
        	
    		Map<Integer, Course> courses = new HashMap<Integer, Course>();
    		courses.put(intPart, course);

        	Professor newProfessor = new Professor(personName, house, bloodStatus, school,  birthday, courses, notes);
        	
        	allProfessors.add(newProfessor);
        		    
        	s = br.readLine();	
        }  
        freader.close(); 
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
