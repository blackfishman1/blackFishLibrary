package S7;

public class DecoratorFan extends Fan{
	private Fan fan;
	public void setFan(Fan fan) {
		this.fan = fan ;
	}
	@Override
	public void on() {
		fan.on();
	}
	@Override
	public void off() {
		fan.off();
	}
	
}
