package S5;

public class FileLogFactory implements LogFactory{
	public Log productLog() {
		System.out.println("File型日志记录工厂返回File类型日志记录对象");
		return new FileLog();
	}
}
