import java.util.HashMap;

public class LoginSVC{
	private HashMap<String, String> loginDatas;
	private HashMap<String, User> userDatas;
	
	public LoginSVC() {
		loginDatas = new HashMap<String, String>();
		userDatas = new HashMap<String, User> ();
		
		loginDatas.put("java","java");
		userDatas.put("java", new User("java","java","��õ��",24,"�赿��"));
	}
	public User login(String id, String passwd) {
		User user = null;
		if(loginDatas.containsKey(id)) {
			if(loginDatas.get(id).equals(passwd)) {
				user = userDatas.get(id);
			}
		}
		return user;
	}
}