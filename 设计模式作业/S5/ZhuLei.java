package S5;

public class ZhuLei {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LogFactory lf;
		Log log;
		lf = ProductFactory.Product("Console");
		log = lf.productLog();
		log.createLog();
	}

}
