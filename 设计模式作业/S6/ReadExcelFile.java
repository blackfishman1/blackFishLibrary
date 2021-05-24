package S6;

public class ReadExcelFile implements DataCollection{
	private ExcelAPI excel;
	public ReadExcelFile() {
		this.excel = new ExcelAPI();
	}
	public void data() {
		excel.read();
	}

}
