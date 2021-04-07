package S5;

public class ConsoleLogFactory implements LogFactory{
	public Log productLog() {
		System.out.println("ConsoleLog型日志记录工厂返回ConsoleLog类型日志记录对象");
		return new ConsoleLog();
	}
}
