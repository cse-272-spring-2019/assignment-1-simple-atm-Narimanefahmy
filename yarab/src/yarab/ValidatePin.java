package yarab;
import java.util.HashMap;
public class ValidatePin {
  HashMap<String, String> usersDictionary;
  
  public ValidatePin() {
  usersDictionary = new HashMap<String, String>();
  usersDictionary.put("Nariman","5568");
  }
  
	public  boolean validate(String username , String pinCode) {
    boolean validationResult = false;
    
		String Password= (String) usersDictionary.get(username);
		if(Password !=null) {
			validationResult = Password.equals(pinCode);}
		return validationResult;
	}

}
   