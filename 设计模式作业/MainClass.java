
class LoginForm{
	private UserDao userDao;
	public LoginForm() {}
	public LoginForm(UserDao userDao) {
		this.userDao = userDao ;
		init();
	}
	public void init() {
		System.out.println("--------------初始化登陆界面--------------");
		System.out.println();
	}
	public void display() {
		System.out.println("--------------展示主界面--------------");
		System.out.println();
	}
	public void validate(String userName,String userPassword) {
		System.out.println("++++++++++开始登录++++++++++");
		System.out.println();
		if(userDao.findUser(userName,userPassword)){
			System.out.println("--------------登陆成功--------------");

		}
	}
}

class UserDao {
	private DBUtil db = new DBUtil();
	public boolean findUser(String userName,String userPassword) {
		db.getConnection();
		System.out.println("用户名：" + userName + " 密码：" + userPassword);
		System.out.println("--------------开始验证账号密码--------------");
		System.out.println();
		System.out.println("--------------账号密码验证成功--------------");
		System.out.println();
		return true;
	}
}

class DBUtil {
	public void getConnection() {
		System.out.println("******开始连接数据库******");
		System.out.println("******数据库连接成功******");
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
