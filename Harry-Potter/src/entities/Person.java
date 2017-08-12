package entities;

public class Person 
{
	private String name;
	private House houseName;
	private BloodStatus bloodStatus;
	private School school;
	private String birthday;

	// Constructors

	
	public Person(String _name)
	{	
		name = _name;
		houseName = null;
		bloodStatus = null;
		school = null;
	}
	
	public Person(String _name, House _houseName, BloodStatus _bloodStatus,
			School _school, String _birthday)
	{	
		name = _name;
		houseName = _houseName;
		bloodStatus = _bloodStatus;
		school = _school;
		birthday = _birthday;
	}
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", houseName=" + houseName + ", bloodStatus=" + bloodStatus + ", school="
				+ school + ", birthday=" + birthday + "]";
	}

	//Setters and getters
	
	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}

	public House getHouseName() {
		return houseName;
	}

	public void setHouseName(House _houseName) {
		houseName = _houseName;
	}

	public BloodStatus getBloodStatus() {
		return bloodStatus;
	}

	public void setBloodStatus(BloodStatus _bloodStatus) {
		bloodStatus = _bloodStatus;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School _school) {
		school = _school;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String _birthday) {
		birthday = _birthday;
	}

}
