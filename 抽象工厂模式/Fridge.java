package Test;

public class Fridge {
    private String brand ;
    public Fridge(){};
    public Fridge(String brand){
        this.brand = brand ;
    }
    public void use(){
        System.out.println("打开"+brand+"品牌的冰箱");
    }
}
