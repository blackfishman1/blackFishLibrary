package S7;

public class ConcreteDecoratorFanB extends DecoratorFan{
	public void on() {
		super.on();
		add();
	}
	public void off() {
		super.off();
		add();
	}
	public void add() {
		System.out.println("---这是个小电风扇---");
	}
}
