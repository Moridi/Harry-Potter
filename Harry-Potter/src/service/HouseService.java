package service;

import java.util.Vector;

import entities.*;

public class HouseService {

	private House house; //The house the services are perform on/at
	
	public House getHouse() {
		return house;
	}
	public void setHouse(House _house) {
		house = _house;
	}

	public HouseService(House house) {
		this.house = house;
	}

	private Vector<House> allHouses; //All the houses in the system
	
	public Vector<House> getAllHouses() {
		return allHouses;
	}

	public void setAllHouses(Vector<House> allHouses) {
		this.allHouses = allHouses;
	}

	public void getData(String fileName) /* implement this method such that you will
	receive the file name (houseDB.txt) as an input and inside the method you will
	open that file, read it and will fill up the information for each house (fill the
	vector)*/
	{
		
	}
	
	public void setData()
	/* implement this method so you can fill
	your database using the vector of houses you have */
	{
		
	}
}
