package chainOfResponsibilityModel;

public class Client {
	public static void main(String[] args) {
		Leader od,om,og;
		od = new Director("张三");
		om = new Manager("李四");
		og = new GeneralManager("王五");
		
		od.setSuccessor(om);
		om.setSuccessor(og);
		
		LeaveRequest l1 = new LeaveRequest("一号员工",15);
		od.handleRequest(l1);
	}
}
