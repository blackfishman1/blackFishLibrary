package CommandPattern;

public class Client {
	public static void main(String[] args) {
		AbstractCommand TVOpenCommand,TVCloseCommand,TVChangeCommand;
		TVOpenCommand = new TVOpenCommand();
		TVCloseCommand = new TVCloseCommand();
		TVChangeCommand = new TVChangeCommand();
		
		Controller controller = new Controller(TVOpenCommand,TVCloseCommand,TVChangeCommand);
		controller.open();
		controller.change();
		controller.close();
	}

}
