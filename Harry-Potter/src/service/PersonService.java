package service;

import java.io.*;
import java.util.Vector;

import entities.*;

public class PersonService {
	
	private Person person;//The Person the services are performed on/at
	private Vector<Person> allPersons; //All the persons in the system
	
	public PersonService(Person _person) throws IOException {
		person = _person;
		allPersons = new Vector<Person>();
		this.getData("PersonDB.txt");
	}
	
	public PersonService() throws IOException {
		this(null);
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person _person) {
		person = _person;
	}

	public Vector<Person> getAllPersons() {
		return allPersons;
	}

	public void setAllPersons(Vector<Person> _allPersons) {
		allPersons = _allPersons;
	}

	/// new classes	
	public Person getPersonByName(String personName){
		return searchByName(personName);
	}
	
	public void showAllPersons(){
		for(Person _person: allPersons){
			System.out.println(_person.toString());
		}
	}
	
	public void showPerson(String personName) throws FileNotFoundException, UnsupportedEncodingException{
		for(Person _person: allPersons){
			if(_person.getName().equals(personName)){
				System.out.println(_person.toString());
				return;
			}
		}
		System.out.println(personName + " not found!");
	}
	
	public void createNewPerson(Person newPerson) throws IOException{
		allPersons.add(newPerson);
		setData();
	}
	
	public void editPerson(Person newPerson) throws IOException{
		person = newPerson;
		setData();
	}
	
	public void deletePerson(Person oldPerson) throws IOException{
		for(Person _person: allPersons){
			if(_person.getName().equals(oldPerson.getName())){
				allPersons.remove(_person);
				setData();
				return;
			}
		}   
		System.out.println(oldPerson + " not found!");
	}
	
	public Person searchByName(String searchedPerson){
		
		for(Person _person: allPersons){
			if(_person.getName().equals(searchedPerson)){
				return _person;
			}
		}   	
		return null;
	}	

	public void getData(String fileName) throws IOException /* implement this method such that you will
	receive the file name (PersonDB.txt) as an input and inside the method you
	will open that file, read it and will fill up the information for each person (fill the
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
        	
        	Person newPerson = new Person(personName, house, bloodStatus, school,  birthday);
        	
        	allPersons.add(newPerson);
        		    
        	s = br.readLine();	
        }  
        freader.close(); 
	}
	
	public void setData() throws IOException
	/* implement this method so you can fill
	your database using the vector of persons you have */
	{
		PrintWriter writer = new PrintWriter("PersonDB.txt", "UTF-8");
		for(Person x: allPersons)
		{			
			writer.println(x.getName());
			writer.println(x.getHouseName().getName());
			writer.println(x.getBloodStatus().toString());
			writer.println(x.getSchool().getName());
			writer.println(x.getBirthday());
			writer.println("*");
		}
		writer.println("$");
		writer.close();
	}
}
