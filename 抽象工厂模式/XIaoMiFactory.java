package Test;

public class XIaoMiFactory implements Factory {
    @Override
    public Television creatTelevision(){
        return new Television("小米");
    }

    @Override
    public Fridge creatFridge(){
        return new Fridge("小米");
    }

    @Override
    public Aircondition creatAircondition(){
        return new Aircondition("小米");
    }
}
