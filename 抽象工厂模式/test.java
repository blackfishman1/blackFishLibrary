package Test;

public class test {
    public static void main(String[] args) {
       Factory hw = new HuaWeiFactory();
       Factory xm = new XIaoMiFactory();
       hw.creatAircondition().use();
       xm.creatFridge().use();
    }
}
