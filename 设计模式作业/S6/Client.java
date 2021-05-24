package S6;

public class Client{
	public static void main(String[] args) {
	DataCollection	dataCollectionImpl = new ReadExcelFile();
	StatementShow statementShow = new ShowWay1();
	statementShow.setImp(dataCollectionImpl);
	statementShow.show();
	}
}
