package S4;

public abstract class Image {
	protected Imagelmp imp;
	public void setImagelmp(Imagelmp imp) {
		this.imp = imp;
	}
	public abstract void parseFile(String fileName);
}
