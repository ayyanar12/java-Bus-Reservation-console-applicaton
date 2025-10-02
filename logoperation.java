package login;
import java.util.*;

public class logoperation {
	static HashMap<String,String> names=new HashMap<>();
	static HashMap<String,String> passwords=new HashMap<>();
	
	public void register(user users) {
		names.put(users.email, users.name);
		passwords.put(users.email,users.password);
	}
	public boolean login(String name,String password,String email) {
		System.out.println(names.get(email));
		System.out.println(passwords.get(email));
		System.out.println(names.size());
	
		if(names.containsKey(email)) {
			if((names.get(email).equals(name)) && (passwords.get(email).equals(password))) {
				return true;
			}
			else {
				return false;
			}
			
		}
		else
		{
			return false;
		}
		
	}
	

}
