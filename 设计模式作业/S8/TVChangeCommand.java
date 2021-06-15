package CommandPattern;

public class TVChangeCommand extends AbstractCommand {
    private Television tv;

    public TVChangeCommand(){
    	this.tv = new Television();
    }

    public void execute(){
    	tv.change();
    }

}
