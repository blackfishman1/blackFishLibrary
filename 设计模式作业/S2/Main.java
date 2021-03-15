package S2;


public class Main {
	public static void main(String args[]) {
	AbstractSource texts = new TextSource();
	AbstractTransforme XMLt = new XMLTransforme();
	texts.change();
	XMLt.change();
	}
}
