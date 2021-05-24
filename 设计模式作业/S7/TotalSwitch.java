package S7;

public class TotalSwitch {
	
	private Light light;
	private AirConditioner airConditioner;
	private Television television;
	private DecoratorFan fan;
	public TotalSwitch() {
		light = new Light();
		fan = new ConcreteDecoratorFanA();
		airConditioner = new AirConditioner();
		television = new Television();
		fan.setFan(new ConcreteFan());
	}
	
	public void on () {
		light.on();
		fan.on();
		airConditioner.on();
		television.on();
	}
	
	public void off() {
		light.off();
		fan.off();
		airConditioner.off();
		television.off();
	}
}
