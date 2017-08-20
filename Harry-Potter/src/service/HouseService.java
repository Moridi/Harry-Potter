package service;

import java.io.*;
import java.util.Vector;

import entities.*;

public class HouseService {

	private House house; //The house the services are perform on/at
	private Vector<House> allHouses; //All the houses in the system
	
	public House getHouse() {
		return house;
	}
	public void setHouse(House _house) {
		house = _house;
	}

	public HouseService(House house) {
		this.house = house;
		allHouses = new Vector<House>();
	}

	public Vector<House> getAllHouses() {
		return allHouses;
	}

	public void setAllHouses(Vector<House> _allHouses) {
		allHouses = _allHouses;
	}

	public void getData(String fileName) throws IOException /* implement this method such that you will
	receive the file name (houseDB.txt) as an input and inside the method you will
	open that file, read it and will fill up the information for each house (fill the
	vector)*/
	{
        FileReader freader = new FileReader(fileName);  
        BufferedReader br = new BufferedReader(freader);  
        String s;  
        while((s = br.readLine()) != null) {
        	if(s.equals("$")){
        		break;
        	}
        	String houseName = s;
        	
        	String schoolName = br.readLine();
        	School school = new School(schoolName);

        	String numberOfStudents = br.readLine();
        	int numOfStudents = Integer.parseInt(numberOfStudents);
        	
        	Vector<Student> students = new Vector<Student>();
        	
        	for(int i = 0; i < numOfStudents; i++){
        		String studentName = br.readLine();
        		students.add(new Student(studentName));    		
        	}
        	House newHouse = new House(houseName, school, students);
        	allHouses.add(newHouse);
        	s = br.readLine();	
        }  
        freader.close(); 
	}
	
	public void setData()
	/* implement this method so you can fill
	your database using the vector of houses you have */
	{
		
	}
}