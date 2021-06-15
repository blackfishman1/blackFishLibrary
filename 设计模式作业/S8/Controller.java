package CommandPattern;

public class Controller {
    private AbstractCommand TVOpenCommand;
    private AbstractCommand TVCloseCommand;
    private AbstractCommand TVChangeCommand;

    public Controller(AbstractCommand TVOpenCommand,AbstractCommand TVCloseCommand,AbstractCommand TVChangeCommand){
    	this.TVOpenCommand = TVOpenCommand ;
    	this.TVCloseCommand = TVCloseCommand;
    	this.TVChangeCommand = TVChangeCommand ;
    }

    public void open(){
    	TVOpenCommand.execute();
    }

    public void close(){
    	TVCloseCommand.execute();
    }

    public void change(){
    	TVChangeCommand.execute();
    }

}
