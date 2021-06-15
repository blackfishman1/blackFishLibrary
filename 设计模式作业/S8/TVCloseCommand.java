package CommandPattern;

public class TVCloseCommand extends AbstractCommand {
    private Television tv;

    public TVCloseCommand(){
    	this.tv = new Television();
    }

    public void execute(){
    	tv.close();
    }

}
