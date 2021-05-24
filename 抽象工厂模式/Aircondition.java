package Test;

public class Aircondition {
    private String brand;
    public Aircondition(){};
    public Aircondition(String brand){
        this.brand = brand ;
    }
    public void use(){
        System.out.println("打开"+brand+"品牌的空调");
    }
}
