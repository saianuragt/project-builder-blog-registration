package businesslogic;

public class RegistrationValidation {
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(validPassword(password,confirmPassword)&& validEmail(email))
			return true;
		else
			return false;
		
	}
	private boolean validPassword(String password, String confirmPassword) {
		if(isPasswordValid(password) && isPasswordValid(confirmPassword))
			return true;
		else
			return false;
		
	}
	private boolean validEmail(String email) {
		return isValid(email);
		
	}
	static boolean isValid(String email) {
	      String regex_email = "^[A-Za-z0-9+_.-]+@(.+)$";
	      return email.matches(regex_email);
	   }
	static boolean isPasswordValid(String password)
    {
		String regex = "^(?=.*[0-9])"
              + "(?=.*[a-z])(?=.*[A-Z])"
//              + "(?=.*[@#$%^&+=])"
              + "(?=\\S+$).{8,20}$";
		return password.matches(regex);
		

    }
}