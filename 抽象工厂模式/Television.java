package Test;

public class Television {
    private String brand;
    public Television(){};
    public Television(String brand){
        this.brand = brand ;
    }
    public void use(){
        System.out.println("看电"+brand+"品牌的视机");
    }
}
