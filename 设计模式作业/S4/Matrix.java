package S4;

public class Matrix {
	public static void main (String args[]) {
		Imagelmp windows = new Windowslmp();
		Image jpg = new JPGImage();
		jpg.setImagelmp(windows);
		jpg.parseFile("Ò»¸öÍ¼Æ¬");
	}
}
