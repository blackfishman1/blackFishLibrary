package Test;

public class HuaWeiFactory implements Factory {
    @Override
    public Television creatTelevision(){
        return new Television("华为");
    }

    @Override
    public Fridge creatFridge(){
        return new Fridge("华为");
    }

    @Override
    public Aircondition creatAircondition(){
        return new Aircondition("华为");
    }
}
