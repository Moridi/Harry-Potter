package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

import entities.*;

public class ProfessorService {
	private Professor professor; //The Professor the services are performe on/at
	private Vector<Professor> allProfessors; //All the Professors in the system

	public ProfessorService(Professor _professor) throws IOException {
		professor = _professor;
		allProfessors = new Vector<Professor>();
		this.getData("ProfessorDB.txt");
	}

	public ProfessorService() throws IOException {
		this(null);
	}


	public Vector<Professor> getAllProfessors() {
		return allProfessors;
	}

	public void setAllProfessors(Vector<Professor> _allProfessors) {
		allProfessors = _allProfessors;
	}

	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor _professor) {
		professor = _professor;
	}
	
	/// new classes	
			public Professor getProfessorByName(String professorName){
				return null;
			}
			
			public void showAllProfessors(){
				
			}
			
			public void showProfessor(String professorName){
				
			}
			
			public void createNewProfessor(Professor newProfessor){
				
			}
			
			public void editProfessor(Professor newProfessor){
				
			}
			
			public void deleteProfessor(Professor oldProfessor){
				
			}
			
			public Professor searchByName(String searchedProfessor){
				return null;
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

	public void setData() throws FileNotFoundException, UnsupportedEncodingException
	/* implement this method so you can fill
	your database using the vector of Professor you have */
	{
		PrintWriter writer = new PrintWriter("ProfessorDB.txt", "UTF-8");
		for(Professor x: allProfessors)
		{			
			writer.println(x.getName());
			writer.println(x.getHouseName().getName());
			writer.println(x.getBloodStatus().toString());
			writer.println(x.getSchool().getName());
			writer.println(x.getBirthday());
			
			Map<Integer, Course> hash = x.getCourses();
		
			for ( Map.Entry<Integer, Course> entry : hash.entrySet()) {
			    Integer key = entry.getKey();
			    Course course = entry.getValue();
			    
			    writer.println(course.getName());
				writer.println(key.toString());		
			}
		
			writer.println(x.getNotes());
			writer.println("*");
		}
		writer.println("$");
		writer.close();
	}
	
}
