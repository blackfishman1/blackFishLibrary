package CommandPattern;

public class TVOpenCommand extends AbstractCommand {
    private Television tv;

    public TVOpenCommand(){
    	this.tv = new Television();
    }

    public void execute(){
    	tv.open();
    
    }

}
