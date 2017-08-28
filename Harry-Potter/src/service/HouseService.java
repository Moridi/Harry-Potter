package service;

import java.io.*;
import java.util.Vector;

import entities.*;

public class HouseService {

	private House house; //The house the services are perform on/at
	private Vector<House> allHouses; //All the houses in the system
	
	public HouseService(House _house) throws IOException {
		house = _house;
		allHouses = new Vector<House>();
		this.getData("HouseDB.txt");
	}

	public HouseService() throws IOException {
		this(null);
	}
	
	public House getHouse() {
		return house;
	}
	public void setHouse(House _house) {
		house = _house;
	}

	public Vector<House> getAllHouses() {
		return allHouses;
	}

	public void setAllHouses(Vector<House> _allHouses) {
		allHouses = _allHouses;
	}
	
	/// new classes	
	public House getHouseByName(String houseName){
		return searchByName(houseName);
	}
	
	public void showAllHouses(){
		for(House _house: allHouses){
			System.out.println(_house.toString());
		}
	}
	
	public void showHouse(String houseName) throws FileNotFoundException, UnsupportedEncodingException{
		for(House _house: allHouses){
			if(_house.getName().equals(houseName)){
				System.out.println(_house.toString());
				return;
			}
		}
		System.out.println(houseName + " not found!");
	}
	
	public void createNewHouse(House newHouse) throws FileNotFoundException, UnsupportedEncodingException{
		allHouses.add(newHouse);
		setData();
	}
	
	public void editHouse(House newHouse) throws FileNotFoundException, UnsupportedEncodingException{
		house = newHouse;
		setData();
	}
	
	public void deleteHouse(House oldHouse) throws FileNotFoundException, UnsupportedEncodingException{
		for(House _house: allHouses){
			if(_house.getName().equals(oldHouse.getName())){
				allHouses.remove(_house);
				setData();
				return;
			}
		}   
		System.out.println(oldHouse + " not found!");
	}
	
	public House searchByName(String searchedHouse){
		
		for(House _house: allHouses){
			if(_house.getName().equals(searchedHouse)){
				return _house;
			}
		}   	
		return null;
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
	
	public void setData() throws FileNotFoundException, UnsupportedEncodingException
	/* implement this method so you can fill
	your database using the vector of houses you have */
	{
		PrintWriter writer = new PrintWriter("HouseDB.txt", "UTF-8");
		for(House x: allHouses)
		{			
			writer.println(x.getName());
			writer.println(x.getSchool().getName());

			writer.println(x.getStudents().size());
			
			for(Student student: x.getStudents()){
				writer.println(student.getName());
			}
			writer.println("*");
		}
		writer.println("$");
		writer.close();
	}
}
