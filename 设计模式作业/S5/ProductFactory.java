package S5;

public class ProductFactory{
	public static LogFactory Product(String s) {
		if("File".equals(s))
			return new FileLogFactory();
		else if ("Database".equals(s))
			return new DatabaseLogFactory();
		else if ("Console".equals(s))
			return new ConsoleLogFactory();
		return null;
		
	}
}
