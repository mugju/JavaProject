import java.util.HashMap;

public class LoginSVC{
	private HashMap<String, String> loginDatas;
	private HashMap<String, User> userDatas;
	
	public LoginSVC() {
		loginDatas = new HashMap<String, String>();
		userDatas = new HashMap<String, User> ();
		
		loginDatas.put("java","java");
		userDatas.put("java", new User("java","java","Ω≈√µµø",24,"±Ëµø«ı"));
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