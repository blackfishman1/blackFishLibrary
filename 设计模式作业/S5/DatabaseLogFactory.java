package S5;

public class DatabaseLogFactory implements LogFactory{
	public Log productLog() {
		System.out.println("Database型日志记录工厂返回Database类型日志记录对象");
		return new DatabaseLog();
	}
}
