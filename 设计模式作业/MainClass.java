
class LoginForm{
	private UserDao userDao;
	public LoginForm() {}
	public LoginForm(UserDao userDao) {
		this.userDao = userDao ;
		init();
	}
	public void init() {
		System.out.println("--------------��ʼ����½����--------------");
		System.out.println();
	}
	public void display() {
		System.out.println("--------------չʾ������--------------");
		System.out.println();
	}
	public void validate(String userName,String userPassword) {
		System.out.println("++++++++++��ʼ��¼++++++++++");
		System.out.println();
		if(userDao.findUser(userName,userPassword)){
			System.out.println("--------------��½�ɹ�--------------");

		}
	}
}

class UserDao {
	private DBUtil db = new DBUtil();
	public boolean findUser(String userName,String userPassword) {
		db.getConnection();
		System.out.println("�û�����" + userName + " ���룺" + userPassword);
		System.out.println("--------------��ʼ��֤�˺�����--------------");
		System.out.println();
		System.out.println("--------------�˺�������֤�ɹ�--------------");
		System.out.println();
		return true;
	}
}

class DBUtil {
	public void getConnection() {
		System.out.println("******��ʼ�������ݿ�******");
		System.out.println("******���ݿ����ӳɹ�******");
		System.out.println();

	}
}
public class MainClass {
	public static void main(String args[]) {
		LoginForm lg = new LoginForm(new UserDao());
		lg.display();
		lg.validate("hhhhhh","123456");
		
		 
	}
	}
