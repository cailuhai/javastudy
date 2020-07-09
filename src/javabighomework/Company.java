package javabighomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

//	public  Map<Integer,Employee> Emp = new HashMap<>();
//	public  Map<String,DakaInfo> check = new HashMap<>();
	ArrayList<Employee> Emp = new ArrayList<>();
	ArrayList<DakaInfo> check = new ArrayList<>();
	
	//新增人员
//	public Map<Integer,Employee> addPeople(int ID,String name){
//	        Emp.put(ID,new Employee(ID,name));
//	        System.out.println("添加信息成功！");
//	        return Emp;
//	    }
//	
	
	public void addPeople(Employee e) {
	    this.Emp.add(e);
	    System.out.println("添加信息成功！");
	  }
	
	public void addPeople1(DakaInfo e1) {
	    this.check.add(e1);
	    System.out.println("添加信息成功！");
	  }
//	 public void addEmployee(Employee e) {
//		    this.Emp.add(e);
//		    System.out.println("The info has been added.");
//		  }
	//删除人员
	 public void deletePeople(int ID){
	        Emp.remove(ID);
	        System.out.println("已经删除员工"+Emp.get(ID));
	    }
	 
	//查找人员
	 public void selectEmp(int id){
		 Employee emp=new Employee(id, null);
	        System.out.println("员工ID:"+emp.getID()+"   员工姓名:"+emp.getName());
	 }
	 
	 //显示员工信息
	 public void showPeople(){
	        for(Employee employ : this.Emp){
	            System.out.println(employ.toString(employ));
	        }
	    }
	 
//	 public void showInfo() {
//		    System.out.println("All info is here:");
//		    for (Employee employ : this.employees)
//		      System.out.println(employ.toString(employ)); 
//		  }
	
}
