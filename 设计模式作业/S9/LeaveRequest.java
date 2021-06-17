package chainOfResponsibilityModel;

public class LeaveRequest {
    private String leaveName;
    private int leaveDays;

    public LeaveRequest(String leaveName,int leaveDays){
    	this.leaveDays = leaveDays ;
    	this.leaveName = leaveName ;
    }

    public void setLeaveName(String leaveName){
    	this.leaveName = leaveName ;
    }

    public void setLeaveDays(int leaveDays){
    	this.leaveDays = leaveDays ;
    }

    public String getLeaveName(){
        return leaveName;
    }

    public int getLeaveDays(){
        return leaveDays;
    }

}
