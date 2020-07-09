package javabighomework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	
 public static void main(String[] args) {
	 

	Company company = new Company();
	//DakaInfo daka=new DakaInfo();
	Main ma=new Main();
	
	Employee e=new Employee(123,"张三");
	Employee e1=new Employee(456,"李四");
	Employee e2=new Employee(789,"王五");
	
	DakaInfo e3=new DakaInfo(123);
	DakaInfo e4=new DakaInfo(456);
	DakaInfo e5=new DakaInfo(789);
	
	company.addPeople(e);
    company.addPeople(e1);
    company.addPeople(e2);
    
    company.addPeople1(e3);
    company.addPeople1(e4);
    company.addPeople1(e5);
    
    System.out.println("");
    company.showPeople();
    System.out.println("");
    int count=0;
    
    do {
    System.out.println("----员工打卡系统----\r\n" + 
    		"输入 0--------退出\r\n" + 
    		"输入 1--------签到\r\n" + 
    		"输入 2--------签退\r\n" + 
    		"输入 3--------查看签到信息\r\n" + 
    		"请输入想执行的操作："); 
    
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt(); 
    
    switch (choice){
    case 0:
    	System.exit(0);
    case 1:
        ma.signIn(company);
        break;
    case 2:
        ma.qiantui(company);
        break;
    case 3:
        ma.showAttendence(company);
        count++;
        System.out.println("第"+count+"次查询");
        break;
    default:
        break;
   
     //choice=sc.nextInt();  
       }
    }while(true);
  }
 
 
 public void signIn(Company company){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("请输入签到员工ID：");
	    boolean bl = false;
	    int Id = sc.nextInt();
		for (DakaInfo daka : company.check) {
	      if (Id == daka.getID()) {
	        if (daka.getcheckinDate() == null || daka.getcheckinDate().getDay() < (new Date()).getDay()) {
	          daka.setcheckinDate(new Date());
	          System.out.println("卡号："+Id+  "打卡成功" );
	        } else 
	        {
	          System.out.println("今天已经打过卡了");
	        } 
	        bl = true;
	        
	        break;
	      } 
	    } 
	    if (!bl) System.out.println("无此ID员工");
	  }
 
 public void qiantui(Company company) {
	    Scanner in = new Scanner(System.in);
	    boolean bl = false;
	    System.out.println("请输入员工ID：");
	    int id = in.nextInt();
	    for (DakaInfo daka : company.check) {
	      if (id == daka.getID()) {
	        if (daka.getcheckinDate() == null || daka.getcheckinDate().getDay() < (new Date()).getDay()) {
	          System.out.println("卡号："+id+ "今天还没有签到，无法签退! ");
	        } else 
	        {
	          daka.setcheckinDate(new Date());
	          System.out.println("卡号："+id+"签退成功!" );
	        } 
	        bl = true;
	        
	        break;
	      } 
	    } 
	    if (!bl) System.out.println("无此ID员工");
	  }
	  
	  public void showAttendence(Company company) {
	    for (DakaInfo daka : company.check)
	      System.out.println(daka.toString(daka));
	  }
 
}
	
	

