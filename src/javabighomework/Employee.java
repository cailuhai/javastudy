package javabighomework;

public class Employee {
 
	private int ID;
	private String name;
	
	public Employee(int ID,String name) {
		this.ID=ID;
		this.name=name;
	}
	
	public void setID(int ID) {
		this.ID=ID;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString(Employee e) {
		return ID+name;
	}
}
