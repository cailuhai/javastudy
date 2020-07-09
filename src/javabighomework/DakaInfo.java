package javabighomework;

import java.util.Date;

public class DakaInfo {

	private int ID;
	 private Date checkinDate = new Date();
	 private Date endDate = new Date();
   // private String name;

    

    public DakaInfo(int ID) {
      this.ID= ID;
      this.checkinDate = null;
      this.endDate = null;
    }
    
    public int getID() {
        return ID;
    }

//    public String getName() {
//        return name;
//    }
    
    public Date getcheckinDate() {
        return checkinDate;
    }
    
    public Date getendDate() {
        return endDate;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
//    public void setName(String name) {
//        this.name = name;
//    }
    
    public void setcheckinDate(Date checkinDate) {
        this.checkinDate= checkinDate;
    }

    public void setendDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public String toString(DakaInfo daka) { 
    	return "签到和签退的信息  :id=" 
               + daka.getID() + ", 签到=" 
               + daka.getcheckinDate() 
               + ", 签退=" 
               + daka.getendDate(); 
    	}

}