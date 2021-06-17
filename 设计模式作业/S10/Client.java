package ObserverPattern;

public class Client {
public static void main(String[] args) {
	MySubject subject = new Cat();
	
	MyObserver ob1,ob2,ob3;
	ob1 = new Mouse();
	ob2 = new Mouse();
	ob3 = new Dog();
	subject.attach(ob1);
	subject.attach(ob2);
	subject.attach(ob3);
	
	subject.cry();
}
}
