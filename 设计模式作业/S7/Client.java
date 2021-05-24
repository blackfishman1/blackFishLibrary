package S7;

public class Client {
public static void main(String[] args) {
	TotalSwitch totalSwitch = new TotalSwitch();
	totalSwitch.on();
	System.out.println("-----------------------------------");
	totalSwitch.off();
}
}
