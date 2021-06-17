package chainOfResponsibilityModel;

public abstract class Leader {
    protected String name;
    protected Leader successor;

    public Leader(String name){
    	this.name = name ;
    }


	public void setSuccessor(Leader successor){
    	this.successor = successor ;
    }

    public Leader getSuccessor(){
        return successor;
    }
    public abstract void handleRequest(LeaveRequest request);
}
